package com.testovoe.egar.controllers;

import com.testovoe.egar.model.EditedSecurity;
import com.testovoe.egar.service.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// TODO: заменить url
// TODO: нормальные наименования в json

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

        String contentToUpdate = edited.getContent();
        String columnId = edited.getId();
        int rowIndex = edited.getIndex();

        securityService.updateEntry(rowIndex, columnId, contentToUpdate);

        return edited.toString();
    }
}
