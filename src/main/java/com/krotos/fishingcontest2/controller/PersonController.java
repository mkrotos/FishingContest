package com.krotos.fishingcontest2.controller;

import com.krotos.fishingcontest2.model.Person;
import com.krotos.fishingcontest2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping("/people")
    public ModelAndView listPeople(ModelAndView model){
        model.addObject("list",personService.getAllPeople());
        model.setViewName("listOfPeople");
        return model;
    }

    @RequestMapping("/people/{id}")
    public ModelAndView personDetails(@PathVariable("id") long id,ModelAndView model){
        Person person=personService.getPerson(id);
        model.addObject("person",person);
        model.setViewName("personDetails");
        return model;
    }

    @RequestMapping("/people/addView")
    public ModelAndView showAddPersonView(ModelAndView model){
        Person person=new Person();
        model.setViewName("addPerson");
        model.addObject("person", person);
        return model;
    }

    @RequestMapping( value = "people/savePerson",method = RequestMethod.POST)
    public ModelAndView savePerson(@ModelAttribute Person person){
        if(person.getId()==null){
            personService.addPerson(person);
        }else {
            personService.updatePerson(person);
        }
        return new ModelAndView("redirect:/people");
    }

    @RequestMapping(value = "people/{id}/delete",method = RequestMethod.GET)
    public ModelAndView deletePerson(@PathVariable("id") long id){
        personService.deletePerson(id);
        return new ModelAndView("redirect:/people");
    }
}
