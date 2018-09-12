package com.krotos;

import com.krotos.PersonDAO;
import com.krotos.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonDAO personDAO;


    @RequestMapping("/people")
    public String listPeople(Model model) {
        model.addAttribute("list", personDAO.toString());
        return "listOfPeople";
    }

    @RequestMapping("people/{id}")
    public String personDetails(@PathVariable("id") long id, Model model) {
        Person person = personDAO.getPerson(id);
        Map<String,String> personDetailsMap=PersonService.mapPersonDetails(person);
        model.addAllAttributes(personDetailsMap);

        return "personDetails";
    }


}
