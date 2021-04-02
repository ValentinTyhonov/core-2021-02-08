package com.company.core.lesson18;

import java.util.Optional;

public class Start
{

    public static void main(String[] args) throws Exception
    {
        Person person = new Person("Mark", 22);

        Optional<Person> optionalPerson1 = Optional.of(person);
        Optional<Person> optionalPerson2 = Optional.ofNullable(null);
        Optional<Person> optionalPerson3 = Optional.empty();

//        Person person1 = optionalPerson1.get(); // поверне об'єкт персон
//        Person person2 = optionalPerson2.get(); // NoSuchElementException
//        Person person3 = optionalPerson3.get(); // NoSuchElementException

        optionalPerson1.isPresent(); // true
        optionalPerson1.isEmpty(); // false

        optionalPerson1.ifPresent(p -> System.out.println("Person present : " + p));
        optionalPerson2.ifPresent(p -> System.out.println("Person present : " + p));

        Person person11 = optionalPerson1.orElse(new Person("Joe", 44)); // Person Mark
        Person person22 = optionalPerson2.orElse(new Person("Joe", 44)); // Person Joe

        Person person111 = optionalPerson1.orElseGet(() -> {
            System.out.println("Container is empty");
            return person;
        });

//        Person person222 = optionalPerson2.orElseThrow(() -> new Exception("No such elem"));

        System.out.println("==========");
        String name1 = optionalPerson1.map(somePerson -> somePerson.getName()).orElse("Joe");
        String name2 = optionalPerson2.map(somePerson -> somePerson.getName()).orElse("Joe");
        System.out.println(name1);
        System.out.println(name2);
    }

}
