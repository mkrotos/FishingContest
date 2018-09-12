package com.krotos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

    @RequestMapping("/example/model")
    public String exampleOfModel(Model model){
        model.addAttribute("message","This is very a important message");
        return "glowny";
    }

}
