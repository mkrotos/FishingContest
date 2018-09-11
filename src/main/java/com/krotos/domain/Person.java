package com.krotos.domain;

public class Person {

    private String name;
    private String surname;
    private int age;
    private char sex;

    public Person() {
    }

    public Person(String name, String surname, int age, char sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return  name+" "+surname+", wiek: "+age+", płeć:"+sex;
    }

    //dodac grupy w klasyfikacji wg wieku i plci (automatyczne dodawanie) + seter gdyby ktos chciał potem zmienic

}

