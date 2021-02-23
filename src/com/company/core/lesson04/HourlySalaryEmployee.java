package com.company.core.lesson04;

public class HourlySalaryEmployee implements Employee
{
    private int salary;
    private int workedHours;

    public HourlySalaryEmployee(int salary)
    {
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }


    public int getWorkedHours()
    {
        return workedHours;
    }

    public void setWorkedHours(int workedHours)
    {
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary()
    {
        return salary * workedHours;
    }
}
