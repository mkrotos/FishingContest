package com.krotos;



import com.krotos.services.PersonDAOService;
import com.krotos.services.PersonService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PersonController {

    @Autowired
    private PersonDAO personDAO;

    @Autowired
    private PersonDAOService personDAOService;

    //private static Logger log=Logger.getLogger(PersonController.class);
    private static Logger log=Logger.getLogger(PersonController.class);

    @RequestMapping("/")
    public String personDetails() {
        return "glowny";
    }

    @RequestMapping("/people")
    public String listPeople(Model model) {
        model.addAttribute("list", personDAO.getPersonList());
        return "listOfPeople";
    }

    @RequestMapping("people/{id}")
    public String personDetails(@PathVariable("id") long id, Model model) {
        Person person = personDAOService.getPersonById(id);
        model.addAttribute(person);

        return "personDetails";
    }

    @RequestMapping("people/addView")
    public String showAddPersonView(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "addPerson";
    }


    @RequestMapping(value = "people/savePerson", method = RequestMethod.POST)
    public String saveNewPerson(@ModelAttribute("person") @Valid PersonDTO personDTO, BindingResult result) {
        log.info(personDTO.toString());
        if (result.hasErrors()) {
            return "redirect:/people/addView";
        }

        personDAO.addPerson(PersonService.personFromDTO(personDTO));
        return "redirect:/people";

    }

    @RequestMapping(value = "people/{id}/delete", method = RequestMethod.GET)
    public String deletePerson(@PathVariable long id) {
        boolean success = personDAOService.deletePersonById(id);

        return "redirect:/people";
    }


}
