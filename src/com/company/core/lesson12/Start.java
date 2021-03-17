package com.company.core.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.company.core.lesson11.Device;

public class Start
{
    public static void main(String[] args)
    {
        Person person = new Person("Tom", "J", 33);
        Person.PersonComparator comparator = person.new PersonComparator();


        if (true)
        {
            class Test
            {
                void print()
                {
                    System.out.println(person);
                    System.out.println("hello");
                }
            }

            Test test = new Test();
            test.print();

        }

        Monitoring monitoring = new Monitoring()
        {
            @Override
            public void monitor(String type)
            {
                System.out.println("monitor " + type);
            }

            @Override
            public String getStatus()
            {
                return "OK";
            }
        };

        Collections.sort(new ArrayList<Person>(), new Comparator<Person>()
            {
                @Override
                public int compare(Person o1, Person o2)
                {
                    return 0;
                }
            });

            Person.StaticComparator staticComparator = new Person.StaticComparator();

        String res = new ArrayList<>().isEmpty() ? "empty" : "not empty";



        Transaction<Person> transaction = new Transaction<>();
    }


    public static class Transaction<T extends  Comparable & Cloneable> {
        private T elem;
    }
}
