package com.company.core.lesson05;

import java.io.IOException;

public enum City
{
    KYIV("Kyiv", 3244432, 23412),
    LVIV("Lviv", 324234, 0),
    PARIS("Paris", 34244, -1);

    private String name;
    private double square;
    private long population;

    City(String name, double square, long population)
    {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    public String getName()
    {
        return name;
    }

    public double getSquare()
    {
        return square;
    }

    public long getPopulation()
    {
        return population;
    }

    public boolean has1M() throws IOException {
        if (population <= 0) {
            throw new IOException("Mistakenly population is less than 0");
        }
        return population >= 1000000;
    }
}
