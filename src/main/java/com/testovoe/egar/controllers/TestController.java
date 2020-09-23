package com.testovoe.egar.controllers;

import com.testovoe.egar.model.ChartData;
import com.testovoe.egar.model.Security;
import com.testovoe.egar.model.SimpleData;
import com.testovoe.egar.repos.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class TestController {

    @Autowired
    private SecurityRepository repos;

    @GetMapping("/test")
    public String test(Model model) {
//        model.addAttribute("result", repos.findByCompanyOrderByDateAsc("лукойл"));
//
//        List<Security> lst = repos.findByCompanyOrderByDateAsc("лукойл");
//
//        List<String> dates = new ArrayList<>();
//        List<Integer> costs = new ArrayList<>();
//
//        lst.stream()
//                .forEach((s) -> {
//                    dates.add(s.getDate());
//                    costs.add(s.getCost());
//                });
//
//        model.addAttribute("resDates", dates);
//        model.addAttribute("resCosts", costs);
//        model.addAttribute("check", "check");
//
//        System.out.println(model.getAttribute("resDates"));

        return "test";
    }

}
