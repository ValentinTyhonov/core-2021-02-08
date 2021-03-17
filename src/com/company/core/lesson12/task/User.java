package com.company.core.lesson12.task;

public class User implements Comparable<User>, Cloneable
{
    private String name;
    private String surname;
    private int age;

    User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    User(String name, String surname, int age) {
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

    @Override
    public int compareTo(User o)
    {
        return name.compareTo(o.getName());
    }
}
