package com.company.core.lesson15;

import java.util.Arrays;

public class Start
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread directThread1 = new DirectThread(Arrays.asList(1, 4, 5, 2, 5, 6, 9, 1, 2, 34, 5, 6), 2000);
        Thread directThread2 = new DirectThread(Arrays.asList(10, 40, 50, 20, 50, 60, 90), 1500);
        Thread directThread3 = new DirectThread(Arrays.asList(100, 400, 500, 200, 500, 600, 900), 1000);

        directThread1.start();

        Thread.sleep(4000);

        directThread2.start();

        Thread.sleep(10000);

//        directThread2.join();

        directThread1.interrupt();

        directThread3.start();
    }
}
