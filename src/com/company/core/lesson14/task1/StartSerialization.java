package com.company.core.lesson14.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StartSerialization
{
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Mark", 25));
        people.add(new Person("Tom", 35));
        List<Person> newPeople = new ArrayList<>();

        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/valentin.tyhonov/logos/core-2021-02-08/src/com/company/core/lesson14/task1/output.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
        {
            objectOutputStream.writeObject(people);
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream("/Users/valentin.tyhonov/logos/core-2021-02-08/src/com/company/core/lesson14/task1/output.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            newPeople = (List<Person>) objectInputStream.readObject();

            System.out.println(newPeople);
        } catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
