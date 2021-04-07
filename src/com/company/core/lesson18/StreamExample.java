package com.company.core.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        Stream<Person> personStream = list.stream()
            .filter(person -> person != null)
            .skip(2)
            .peek(person -> person.setAge(person.getAge() + 5))
            .limit(2)
            .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));
//            .map(person -> person.getName())
//            .filter(name -> name != null)

        Map<String, Person> map = personStream.collect(Collectors.toMap(
            person -> person.getName(), person -> person
        ));

        String result = personStream.map(person -> person.getName())
            .collect(Collectors.joining(", "));

        IntStream ageStream = list.stream()
            .filter(person -> person != null)
            .skip(2)
            .peek(person -> person.setAge(person.getAge() + 5))
            .limit(2)
            .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
            .mapToInt(person -> person.getAge());
    }
}
