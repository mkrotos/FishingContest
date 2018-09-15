package com.krotos.services;

import com.krotos.Person;
import com.krotos.PersonDTO;

public class PersonService {

    public static Person personFromDTO(PersonDTO personDTO){
        Person person=new Person();

        person.setId(personDTO.getId());
        person.setName(personDTO.getName());
        person.setSurname(personDTO.getSurname());
        person.setAge(personDTO.getAge());
        person.setSex(personDTO.getSex());
        person.setMail(personDTO.getMail());
        person.setPhoneNumber(personDTO.getPhoneNumber());

        return person;
    }
}
