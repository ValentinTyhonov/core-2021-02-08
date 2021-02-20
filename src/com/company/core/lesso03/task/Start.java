package com.company.core.lesso03.task;

public class Start
{
    public static void main(String[] args)
    {
        Rose roseDark = new Rose("Dark red", 44);
        Rose roseLight = new Rose("Light rose", 42);
        Tulpan tulpan = new Tulpan("Red", 30);

        Flower[] flowers = {roseDark, roseDark, roseDark, roseLight, roseLight, tulpan, tulpan};

        int sum = 0;
        for(Flower flower : flowers) {
            flower.smell();
            sum += flower.getPrice();
        }

        System.out.println(sum);
    }
}
