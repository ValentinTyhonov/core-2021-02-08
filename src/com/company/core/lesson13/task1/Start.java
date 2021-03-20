package com.company.core.lesson13.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Start
{
    public static void main(String[] args) throws IOException
    {
        String data = "";

        try (InputStream inputStream = new FileInputStream("/Users/valentin.tyhonov/logos/core-2021-02-08/src/com/company/core/lesson13/task1/input.txt"))
        {
            while (inputStream.available() > 0)
            {
                data += (char) inputStream.read();
            }
            System.out.println(data);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        List<Person> people = new ArrayList<>();

        for (String line : data.split("\n")) {
            String[] elems = line.split(",");
            Person person = new Person(elems[0].trim(), Integer.parseInt(elems[1].trim()));
            people.add(person);
        }

        System.out.println(people);

        File file = new File("/Users/valentin.tyhonov/logos/core-2021-02-08/src/com/company/core/lesson13/task1/output.txt");
        file.createNewFile();

        try (OutputStream outputStream = new FileOutputStream(file.getAbsolutePath())) {
//            for (byte s : people.toString().getBytes()) {
//                outputStream.write(s);
//            }
            outputStream.write(people.toString().getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
