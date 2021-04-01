package com.company.core.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Start
{

    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mark", 19));
        people.add(new Person("Tom", 10));
        people.add(new Person("Jack", 49));
        people.add(new Person("Sam", 17));
        people.add(new Person("Max", 29));
        List<Person> adults = new ArrayList<>();

        Person person1 = new Person("wew", 121);

        people.forEach(person1::clone);

        people.forEach(Person::toString);

        people.stream().map(elem -> elem.getAge()).forEach(age -> person1.setAge(age));
        people.stream().map(Person::getAge).forEach(person1::setAge);

        System.out.println(people);

        people.forEach(person -> {
            if (person.getAge() >= 18) {
                adults.add(person);
            }
        });
        // ==
        for (Person person : people) {
            if (person.getAge() >= 18) {
                adults.add(person);
            }
        }

        Test test = (x, y) -> "Result: " + (x + y);
        System.out.println(test.value(1, 4));

        System.out.println(test(x -> "Res: " + (x * x)));
    }

    private static String test(Function<Integer, String> function) {
        return function.apply(343);
    }


}
