package com.company.core.lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task
{
    public static void main(String[] args)
    {
        Map<String, Person> people = new HashMap<>();
        people.put("JK 124212", new Person("Marian", "Ok", 33));
        people.put("IK 214441", new Person("Borys", "Lo", 12));
        people.put("UJ 923932", new Person("Anton", "Jk", 39));

        Scanner scanner = new Scanner(System.in);
        String passport = scanner.nextLine();

        System.out.println("Looking for person with passport ID - " + passport);
        if (people.containsKey(passport)) {
            System.out.println(people.get(passport));
        } else {
            System.out.println("There is no such person.");
        }

        System.out.println("Looking for children ...");
        Iterator<Map.Entry<String, Person>> iterator = people.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Person> entry = iterator.next();
            if (entry.getValue().getAge() < 18) {
                System.out.println(entry.getKey());
                iterator.remove();
            }
        }

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getKey());
        }


    }
}
