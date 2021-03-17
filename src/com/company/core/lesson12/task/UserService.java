package com.company.core.lesson12.task;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class UserService<T extends Account, K extends Comparable>
{
    public void printUsers(Set<K> users)
    {
        System.out.println("Print all users:");
        for (K user : users) {
            System.out.println(user);
        }
        System.out.println();
    }

    public void printAccounts(Collection<T> accounts) {
        System.out.println("Print all accounts:");
        for (T account : accounts) {
            System.out.println(account);
        }
        System.out.println();
    }

    public double getCharge(T account) {
        System.out.println("Calculate charge...");
        return account.getSum() * 0.05;
    }



}
