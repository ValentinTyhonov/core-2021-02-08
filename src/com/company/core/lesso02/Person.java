package com.company.core.lesso02;

public class Person
{
    private String name;
    private String surname;
    private int age;

//    Person() {}

//    Person() {
//        this.name = "Tom";
//        this.name = "Tom";
//        this.age = 18;
//    }

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    private String test() {
        return "";
    }
}
