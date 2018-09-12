package com.krotos;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDAO {

    private List<Person> personList=new ArrayList<>();

    public void addPerson(String name, String surname){
        personList.add(new Person(name,surname));
    }

    public Person getPerson(int index){
        return personList.get(index);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void dispList(){
        for(int i=0;i<personList.size();i++){
            System.out.println(i+": "+personList.get(i).getName()+" "+
            personList.get(i).getSurname()+", age: "+personList.get(i).getAge());
        }
    }

    @Override
    public String toString() {
        return "PersonDAO{" +
                "personList=" + personList +
                '}';
    }
}
