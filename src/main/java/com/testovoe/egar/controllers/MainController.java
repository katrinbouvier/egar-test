package com.testovoe.egar.controllers;

import com.testovoe.egar.domain.Security;
import com.testovoe.egar.repos.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private SecurityRepository securitiesRepo;

    public MainController(SecurityRepository securitiesRepo) {
        this.securitiesRepo = securitiesRepo;
    }

    @GetMapping("/hell")
    public String hello(){
        return "hello";
    }

    @GetMapping("/all")
    public String showAll(Model model) {

        model.addAttribute("securities", securitiesRepo.findAll());

        return "main/all_securities";
    }

    @PostMapping("/all")
    public String add(@RequestParam String date,
                      @RequestParam String company,
                      @RequestParam String cost, Model model) {

        Security security = new Security(date, company, Integer.parseInt(cost));
        securitiesRepo.save(security);
        model.addAttribute("securities", securitiesRepo.findAll());
        return "main/all_securities";

    }
}
