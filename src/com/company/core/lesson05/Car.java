package com.company.core.lesson05;

import com.company.core.lesso03.Engine;
import com.company.core.lesso03.Passanger;

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

    public void drive(TrafficSignals signal) {
        if (signal.equals(TrafficSignals.RED)) {
            System.out.println("go");
        }
    }
}
