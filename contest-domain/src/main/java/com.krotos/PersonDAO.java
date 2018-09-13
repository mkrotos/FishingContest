package com.krotos;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonDAO {

    private List<Person> personList=new ArrayList<>();

    public PersonDAO() {
        init();
    }

    public void addPerson(long id, String name, String surname){
        personList.add(new Person(id,name,surname));
    }
    public void addPerson(Person person){
        personList.add(person);
    }



    public List<Person> getPersonList() {
        return personList;
    }

    @Override
    public String toString() {
        return personList.stream().map(person -> person.toString()+"\n").collect(Collectors.joining());
    }

    private void init(){
        Person person1=new Person(10001,"Adam","Zamwi",32);
        Person person2=new Person(10002,"Bart","Green",22);
        personList.add(person1);
        personList.add(person2);
    }
}
