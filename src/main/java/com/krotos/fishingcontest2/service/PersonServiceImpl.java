package com.krotos.fishingcontest2.service;

import com.krotos.fishingcontest2.dao.PersonDAO;
import com.krotos.fishingcontest2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    @Transactional
    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return personDAO.getAllPeople();
    }

    @Override
    public void deletePerson(long id) {
        personDAO.deletePerson(id);
    }

    @Override
    public boolean updatePerson(Person person) {
        return personDAO.updatePerson(person);
    }

    @Override
    public Person getPerson(long id) {
        return personDAO.getPerson(id);
    }
}
