package com.company.core.lesso03.task;

public class Rose extends Flower
{

    public Rose(String color, int price)
    {
        super(color, price);
    }

    @Override
    public void smell()
    {
        System.out.println("Smells fine");
    }
}