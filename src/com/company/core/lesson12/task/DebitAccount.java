package com.company.core.lesson12.task;

public class DebitAccount extends Account<String>
{
    public DebitAccount(String id)
    {
        super(id);
    }

    public DebitAccount(String id, int sum)
    {
        super(id, sum);
    }
}
