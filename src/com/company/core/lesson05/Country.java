package com.company.core.lesson05;

public enum Country
{
    UKRAINE("Ukraine", "UAH", City.KYIV),
    FRANCE("France", "EUR", City.PARIS);

    private String name;
    private String currency;
    private City capital;

    Country(String name, String currency, City capital)
    {
        this.name = name;
        this.currency = currency;
        this.capital = capital;
    }

    public String getName()
    {
        return name;
    }

    public String getCurrency()
    {
        return currency;
    }

    public City getCapital()
    {
        return capital;
    }

    public boolean hasUsd() {
        return currency.equals("USD");
    }
}
