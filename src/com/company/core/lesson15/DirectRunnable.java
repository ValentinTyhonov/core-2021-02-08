package com.company.core.lesson15;

import java.util.List;

public class DirectRunnable implements Runnable
{
    private List<Integer> numbers;
    private long timeout;

    public DirectRunnable(List<Integer> numbers, long timeout)
    {
        this.numbers = numbers;
        this.timeout = timeout;
    }

    @Override
    public void run()
    {
        for (int elem : numbers)
        {
            System.out.println(elem);

            try
            {
                Thread.sleep(timeout);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                break;
            }

        }
    }
}
