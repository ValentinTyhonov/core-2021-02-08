package com.company.core.lesson04;

public class FinService
{
    public void pay(Employee employee) {
        System.out.println("This employee got " + employee.calculateSalary() + " this month.");
    }
}
