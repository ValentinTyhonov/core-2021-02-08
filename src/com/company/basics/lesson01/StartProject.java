package com.company.basics.lesson01;

public class StartProject
{
    public static void main(String[] args)
    {
        long number = 245623545225423361l;
        float drob = 443356463.354643f;
        char c = 'g';

        double d = number + drob;

        number = number + 234624;
        number += 234624l;

        int a = 5;
        a %= 2;

        System.out.println(number);
        System.out.println(a++);
        boolean b = !(a >= 2 || a < 10) && (a == 6);
        System.out.println(a > 2);

    }

}
