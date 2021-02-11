package com.company.basics.lesson02;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

//        calc(3, 4, -7);
//        calc(4, -5, 9);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String str = scanner.nextLine();
        int ii = scanner.nextInt();
        System.out.println("OK : " + str);

        double x = calc(3, 4, -7);
        double y = calc(4, -5, 9);

        String f = 33 + 33 + "44";
        System.out.println(f);
        f = f.replace("66", "gygyg");
        System.out.println(f);
        f.equals("gYgyg44");
        "gYgyg44".contains("4445"); // false
        "gYgyg44".contains("44"); // true
        "gYgyg44".startsWith("44"); // false
        boolean b = "gYgyg44".endsWith("44"); // true

        int k = "gYgyg44".indexOf("g"); // 0
        "ghgYg44".indexOf("Yg"); // 3
        "ghgYg44".charAt(3); // Y

        System.out.println("   feervrw  \n".trim());
        String[] a = "3 4 3 52".split(" "); // ["3", "4", "3", "52"]

        // Створюємо двовимірний масив і заповнюємо його через консоль (клас Scanner)
        String[][] aa = new String[4][6];
        for (int i = 0; i < aa.length; i++)
        {
            for (int j = 0; j < aa[i].length; j++)
            {
                aa[i][j] = scanner.next();
            }
        }


    }

    static double calc(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
            return x1;
        } else {
            System.out.println("d <= 0, тому коренів немає");
            return 0;
        }
    }

}
