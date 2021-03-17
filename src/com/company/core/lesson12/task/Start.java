package com.company.core.lesson12.task;

import java.util.HashMap;
import java.util.Map;

public class Start
{
    public static void main(String[] args)
    {
        Map<User,Account<?>> accounts = new HashMap<>();
        accounts.put(new User("Tom", "J"), new Account<String>("3524784378", 24312));
        accounts.put(new User("Mat", "K"), new CreditAccount(34124, 8484));
        accounts.put(new User("Kan", "M"), new CreditAccount(3244, 1241));

        UserService<Account<?>, User> service = new UserService<>();
        service.printAccounts(accounts.values());
        service.printUsers(accounts.keySet());

        for (Map.Entry<User,Account<?>> elem : accounts.entrySet()) {
            System.out.println(service.getCharge(elem.getValue()));
        }
    }
}
