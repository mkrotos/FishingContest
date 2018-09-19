package com.krotos.fishingcontest2.controller;

import com.krotos.fishingcontest2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public ModelAndView home(ModelAndView model){
        model.setViewName("home");
        model.addObject("message","Just a test");
        return model;
    }
}
