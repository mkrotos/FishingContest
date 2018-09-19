package com.krotos.fishingcontest2.service;

import com.krotos.fishingcontest2.model.Person;

import java.util.List;

public interface PersonService {

    void addPerson(Person person);

    List<Person> getAllPeople();

    void deletePerson(long id);

    Person updatePerson(Person person);

    Person getPerson(long id);
}
