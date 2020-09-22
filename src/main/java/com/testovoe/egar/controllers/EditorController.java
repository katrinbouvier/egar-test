package com.testovoe.egar.controllers;

import com.testovoe.egar.model.EditedSecurity;
import com.testovoe.egar.repos.SecurityRepository;
import com.testovoe.egar.service.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// TODO: заменить url
// TODO: нормальные наименования в json
// TODO: заменить геттеры/сеттеры в editedsecurity

@Controller
public class EditorController {

//    @Autowired
    private SecurityService securityService;

    public EditorController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @RequestMapping(value="/add-new", method=RequestMethod.POST)
    @ResponseBody
    public String addSecurity(@RequestBody EditedSecurity edited){

        String contentToUpdate = edited.getcontent();
        String columnId = edited.getid();
        int rowIndex = edited.getIndex();

        securityService.updateEntry(rowIndex, columnId, contentToUpdate);

        return edited.toString();
    }
}
