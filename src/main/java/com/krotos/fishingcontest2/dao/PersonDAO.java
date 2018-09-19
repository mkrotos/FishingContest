package com.krotos.fishingcontest2.dao;

import com.krotos.fishingcontest2.model.Person;

import java.util.List;

public interface PersonDAO {

    void addPerson(Person person);

    List<Person> getAllPeople();

    void deletePerson(long id);

    boolean updatePerson(Person person);

    Person getPerson(long id);
}
