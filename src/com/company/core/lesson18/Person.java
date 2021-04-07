package com.company.core.lesson18;

public class Person
{
    private String name;
    private int age;

    @Override
    public String toString()
    {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void clone(Person person) {
        this.age = person.getAge();
        this.name = person.getName();
    }

    public String getName()
    {
        return name;
    }

    public Person setName(String name)
    {
        this.name = name;
        return this;
    }

    public int getAge()
    {
        return age;
    }

    public Person setAge(int age)
    {
        this.age = age;
        return this;
    }
}
