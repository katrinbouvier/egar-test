package com.testovoe.egar.controllers;

import com.testovoe.egar.model.Security;
import com.testovoe.egar.repos.SecurityRepository;
import com.testovoe.egar.service.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

//    @Autowired
    private SecurityRepository securityRepo;
    
    private SecurityService securityService;

    public MainController(SecurityRepository securityRepo,
                          SecurityService securityService) {
        this.securityRepo = securityRepo;
        this.securityService = securityService;
    }

    @GetMapping("/all")
    public String showAll(Model model) {

        model.addAttribute("securities", securityService.findAll());
        model.addAttribute("companies", securityService.getCompanies());
        model.addAttribute("dates", securityService.getDates());

        return "main/all_securities";
    }

    @PostMapping("/all")
    public String add(@RequestParam String date,
                      @RequestParam String company,
                      @RequestParam String cost, Model model) {
        System.out.println("called");
        Security security = new Security(date, company, Integer.parseInt(cost));
        securityRepo.save(security);
        model.addAttribute("securities", securityService.findAll());
        model.addAttribute("companies", securityService.getCompanies());
        model.addAttribute("dates", securityService.getDates());
        return "redirect:/all";
    }
}
