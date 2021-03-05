package com.company.core.lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Marl", "T", 74);
        Person person2 = new Person("Mool", "L", 74);
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person.getName());
        }

        Collections.sort(people, new PersonComparator());

        for (Person person : people) {
            System.out.println(person.getName());
        }



    }
}
