package com.krotos.services;

import com.krotos.Person;
import com.krotos.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PersonDAOService {

    @Autowired
    private PersonDAO personDAO;


    public void dispList() {
        List<Person> personList=personDAO.getPersonList();
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(i + ": " + personList.get(i).getName() + " " +
                    personList.get(i).getSurname() + ", age: " + personList.get(i).getAge());
        }
    }

    public Person getPersonById(long id) {
        List<Person> personList=personDAO.getPersonList();

        return personList.stream().filter(person -> person.getId() == id).findFirst().get();
    }

    public boolean deletePersonById(long id) {
        List<Person> personList=personDAO.getPersonList();

        try {
            personList.remove(getPersonById(id));
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
