package com.company.core.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample
{
    public static void main(String[] args)
    {
        List<Person> list = new ArrayList<>();
        list.add(new Person(null, 18));
        list.add(null);
        list.add(new Person("Matt", 19));
        list.add(new Person("Mark", 22));
        list.add(null);
        list.add(new Person(null, 33));

//        Stream.of(1, 2, 4, 5);
        list.stream()
            .filter(person -> person != null)
            .map(person -> person.getName())
            .filter(name -> name != null)
            .sorted()
            .forEach(name -> System.out.println("Result: " + name));
    }
}
