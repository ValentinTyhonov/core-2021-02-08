package com.company.core.lesson15;

import java.util.List;

public class DirectThread extends Thread
{
    private List<Integer> numbers;
    private long timeout;

    public DirectThread(List<Integer> numbers, long timeout)
    {
        this.numbers = numbers;
        this.timeout = timeout;
    }

    @Override
    public void run()
    {
        for (int elem : numbers)
        {
            if (!isInterrupted())
            {
                System.out.println(getName() + ": " + elem);

                try
                {
                    sleep(timeout);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
}
