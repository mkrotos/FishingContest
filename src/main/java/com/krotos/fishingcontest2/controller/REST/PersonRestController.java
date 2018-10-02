package com.krotos.fishingcontest2.controller.REST;

import com.krotos.fishingcontest2.model.Person;
import com.krotos.fishingcontest2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonRestController {

    @Autowired
    private PersonService personService;

    @GetMapping("/api/people")
    public List<Person> getPeople(){
        return personService.getAllPeople();
    }

    @GetMapping("api/people/{id}")
    public Person getPerson(@PathVariable("id") long id){
        return personService.getPerson(id);
    }

    @PostMapping("api/people")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @PutMapping("api/people")
    public boolean updatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }

    @DeleteMapping("api/people/{id}")
    public void deletePerson(@PathVariable("id") long id){
        personService.deletePerson(id);
    }


}
