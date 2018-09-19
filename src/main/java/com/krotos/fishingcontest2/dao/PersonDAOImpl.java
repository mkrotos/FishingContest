package com.krotos.fishingcontest2.dao;

import com.krotos.fishingcontest2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void addPerson(Person person) {
        entityManager.merge(person);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> getAllPeople() {
        return entityManager.createQuery("select c from Person c").getResultList();

    }

    @Override
    public void deletePerson(long id) {
        Person person=entityManager.find(Person.class,id);
        if(person!=null){
            this.entityManager.remove(person);
        }
    }

    @Override
    public boolean updatePerson(Person person) {
        if(!entityManager.contains(person)) {
            entityManager.merge(person);
            return true;
        }
        return false;
    }

    @Override
    public Person getPerson(long id) {
        return entityManager.find(Person.class,id);
    }
}
