package com.krotos;

public class Person {

    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private Character sex;
    private Integer phoneNumber;
    private String mail;

    public Person() {
    }

    public Person(long id, String name, String surname, int age, char sex) {
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public Person(long id, String name, String surname, int age) {
        this.id=id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(long id, String name, String surname) {
        this.id=id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return  name+" "+surname+", age: "+age;
    }

    //dodac grupy w klasyfikacji wg wieku i plci (automatyczne dodawanie) + seter gdyby ktos chciał potem zmienic

}

