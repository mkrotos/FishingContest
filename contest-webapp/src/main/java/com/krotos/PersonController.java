package com.krotos;

import com.krotos.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
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
        Map<String, String> personDetailsMap = new HashMap<>();
        personDetailsMap.put("nameAndSurname", person.getName() + " " + person.getSurname());
        personDetailsMap.put("id", person.getId().toString());
        personDetailsMap.put("name", person.getName());
        personDetailsMap.put("surname", person.getSurname());
        personDetailsMap.put("age", person.getAge().toString());
        personDetailsMap.put("sex", person.getSex().toString());
        personDetailsMap.put("phoneNumber", person.getPhoneNumber().toString());
        personDetailsMap.put("mail", person.getMail());

        for (Map.Entry<String,String> entry: personDetailsMap.entrySet()){
            if(entry.getValue().equals(null)){
                entry.setValue("n");

            }
        }

        model.addAllAttributes(personDetailsMap);

        return "personDetails";
    }
}
