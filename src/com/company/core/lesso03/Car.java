package com.company.core.lesso03;

public class Car
{
    private String model;
    private Engine engine;
    private Passanger[] passangers;

    Car(String model, Engine engine) {
        this.engine = engine;
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public Passanger[] getPassangers()
    {
        return passangers;
    }

    public void setPassangers(Passanger[] passangers)
    {
        this.passangers = passangers;
    }
}
