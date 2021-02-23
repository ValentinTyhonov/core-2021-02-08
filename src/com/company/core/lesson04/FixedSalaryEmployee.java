package com.company.core.lesson04;

import com.company.core.lesso03.Person;

public class FixedSalaryEmployee implements Employee
{
    private int salary;

    public FixedSalaryEmployee(int salary)
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

    @Override
    public double calculateSalary()
    {
        return salary;
    }
}
