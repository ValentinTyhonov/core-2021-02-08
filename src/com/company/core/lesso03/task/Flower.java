package com.company.core.lesso03.task;

public abstract class Flower
{
    private String color;
    private int price;

    public Flower(String color, int price)
    {
        this.color = color;
        this.price = price;
    }

    public abstract void smell();

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
