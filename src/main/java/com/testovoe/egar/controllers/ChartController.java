package com.testovoe.egar.controllers;

import com.testovoe.egar.model.ChartCompanyParameter;
import com.testovoe.egar.model.ChartData;
import com.testovoe.egar.model.Security;
import com.testovoe.egar.service.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// TODO: проверка на дату для записей

@Controller
public class ChartController {

    private String companyParam;

    private SecurityService securityService;

    public ChartController(SecurityService securityService) {
                this.securityService = securityService;
    }

    @GetMapping("/get-chart-data")
    @ResponseBody
    public ChartData getChartData() {

        List<Security> lst = securityService.findByCompany(companyParam);

        List<String> dates = new ArrayList<>();
        List<Integer> costs = new ArrayList<>();

        lst.stream().forEach((s) -> {
                    dates.add(s.getDate());
                    costs.add(s.getCost());
                });

        ChartData data = new ChartData();
        data.setDates(dates);
        data.setCosts(costs);

        return data;
    }

    @RequestMapping(value = "/get-chart-data", method = RequestMethod.POST)
    @ResponseBody
    public String getCompanyParam(@RequestBody ChartCompanyParameter param){

        companyParam = param.getCompany().trim();
        System.out.println(companyParam);

        return "hi, my companyParam = null is "+ (companyParam == null);
    }
}

