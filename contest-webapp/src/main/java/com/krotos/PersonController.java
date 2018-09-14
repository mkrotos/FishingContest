package com.krotos;

import com.krotos.services.PersonDAOService;
import com.krotos.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private PersonDAOService personDAOService;


    @RequestMapping("/people")
    public String listPeople(Model model) {
        model.addAttribute("list", personDAO.getPersonList());
        return "listOfPeople";
    }

    @RequestMapping("people/{id}")
    public String personDetails(@PathVariable("id") long id, Model model) {
        Person person = personDAOService.getPersonById(id);
        Map<String,String> personDetailsMap=PersonService.mapPersonDetails(person);
        model.addAllAttributes(personDetailsMap);

        return "personDetails";
    }

    @RequestMapping("people/addView")
    public String showAddPersonView(Model model){
        Person person=new Person();
        model.addAttribute("person",person);
        return "addPerson";
    }

    @RequestMapping(value = "people/savePerson",method = RequestMethod.POST)
    public String saveNewPerson(@ModelAttribute Person person){
        if(person.getId()==null){
            return "redirect:/people/addView";
        }
        personDAO.addPerson(person);
        return "redirect:/people";
    }

    @RequestMapping(value = "people/{id}",method = RequestMethod.DELETE)
    public String deletePerson(@PathVariable long id){
        boolean succes=personDAOService.deletePersonById(id);

        return "redirect:/people";
    }


}
