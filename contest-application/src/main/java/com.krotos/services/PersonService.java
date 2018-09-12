package com.krotos.services;

import com.krotos.Person;

import java.util.*;

public class PersonService {

    public static Map<String, String> mapPersonDetails(Person person) {
        Map<String, String> personDetailsMap = new HashMap<>();

        try {
            personDetailsMap.put("nameAndSurname", person.getName() + " " + person.getSurname());
            personDetailsMap.put("id", person.getId().toString());
            personDetailsMap.put("name", person.getName());
            personDetailsMap.put("surname", person.getSurname());
            personDetailsMap.put("age", person.getAge().toString());
            personDetailsMap.put("sex", person.getSex().toString());
            personDetailsMap.put("phoneNumber", person.getPhoneNumber().toString());
            personDetailsMap.put("mail", Optional.ofNullable(person.getMail()).toString()); //??
        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println( e.getClass().getSimpleName());


        }

        System.out.println(personDetailsMap);

        return personDetailsMap;
    }

}
