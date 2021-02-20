package com.company.core.lesso03.task;

public class Tulpan extends Flower
{

    public Tulpan(String color, int price)
    {
        super(color, price);
    }

    @Override
    public void smell()
    {
        System.out.println("Smells good");
    }
}
