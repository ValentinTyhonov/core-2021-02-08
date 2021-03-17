package com.company.core.lesson12.task;

public class CreditAccount extends Account<Integer>
{
    public CreditAccount(Integer id)
    {
        super(id);
    }

    public CreditAccount(Integer id, int sum)
    {
        super(id, sum);
    }
}
