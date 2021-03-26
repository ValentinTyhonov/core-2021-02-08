package com.company.core.lesson14.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Start
{
    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();
        List<Person> people = new ArrayList<>();

        try (Reader reader = new FileReader("/Users/valentin.tyhonov/logos/core-2021-02-08/src/com/company/core/lesson14/task1/input.txt"))
        {
            while (reader.ready())
            {
                builder.append((char) reader.read());
            }
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println(builder);

        for (String line : builder.toString().split("\n"))
        {
            String[] array = line.split(",");
            Person person = new Person(array[0].trim(), Integer.parseInt(array[1].trim()));
            people.add(person);
        }

        System.out.println(people);

        try (Writer writer = new FileWriter("/Users/valentin.tyhonov/logos/core-2021-02-08/src/com/company/core/lesson14/task1/output.txt"))
        {
            writer.write(people.toString());
            writer.flush();

        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
