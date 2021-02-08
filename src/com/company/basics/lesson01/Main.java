package com.company.basics.lesson01;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = 6;
        int c = -5;

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else {
            System.out.println("d <= 0, тому коренів немає");
        }

    }
}
