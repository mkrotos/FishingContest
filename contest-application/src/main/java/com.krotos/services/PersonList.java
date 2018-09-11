package com.krotos.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<Person> personList=new ArrayList<>();

    public void addPerson(String name, String surname){
        personList.add(new Person(name,surname));
    }

    public Person getPerson(int index){
        return personList.get(index);
    }



    @Override
    public String toString() {
        return "PersonList{" +
                "personList=" + personList +
                '}';
    }
}
