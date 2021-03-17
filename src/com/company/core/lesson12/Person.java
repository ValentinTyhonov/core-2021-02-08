package com.company.core.lesson12;

import java.util.Comparator;

public class Person implements Comparable<Person>, Cloneable
{
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public String getName() {
        PersonComparator comparator = new PersonComparator();
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
    public int compareTo(Person o)
    {
        if (age > o.getAge()) {
            return 1;
        } else if (age < o.getAge()) {
            return -1;
        } else {
            return name.compareTo(o.getName());
        }
    }

    public class PersonComparator implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2)
        {
            Person.this.setName("Mark");
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class StaticComparator implements Comparator<Person>
    {
        @Override
        public int compare(Person o1, Person o2)
        {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
