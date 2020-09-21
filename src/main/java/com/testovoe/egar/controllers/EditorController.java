package com.testovoe.egar.controllers;

import com.testovoe.egar.domain.EditedSecurity;
import com.testovoe.egar.repos.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EditorController {

    @Autowired
    private SecurityRepository securitiesRepo;

    public EditorController(SecurityRepository securitiesRepo) {
        this.securitiesRepo = securitiesRepo;
    }

    @RequestMapping(value="/all/add-new",
    method= RequestMethod.POST,
    produces="application/json", consumes="application/json",
    headers={"Content-type=application/json"})
    @ResponseBody
    public String addSecurity(@RequestBody EditedSecurity edited){
        System.out.println("called addSecurity");
        System.out.println(edited.toString());
        return edited.toString();
    }
}
