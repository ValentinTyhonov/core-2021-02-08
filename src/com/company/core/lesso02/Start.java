package com.company.core.lesso02;

import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
    {
        Person newOnePerson = new Person("Mark", "Twen", 40);

        Person somePerson = new Person("Lilo", "whdv", 12);

        somePerson.setSurname("Koko");

        System.out.println(somePerson.getName() + " " + somePerson.getSurname());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть суму грошей:");
        int sum = scanner.nextInt();

        System.out.println("Введіть відсоткову ставку:");
        int percent = scanner.nextInt();

        System.out.println("Введіть кількість років:");
        int years = scanner.nextInt();

        for (int i = 0; i < years; i++) {
            double prybutok = sum * percent / 100;
            System.out.println("На " + i + " рік рибуток становить " + prybutok);
            sum += prybutok;
        }

        int[][][][][] oo;

        System.out.println(sum);

    }
}
