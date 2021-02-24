package com.company.core.lesson05;

import java.io.IOException;
import java.util.Scanner;

public class Start
{
    public static void main(String[] args) throws Exception
    {
        for (TrafficSignals signal : TrafficSignals.values()) {
            System.out.println(signal.name());
            System.out.println(signal.ordinal());
        }

        TrafficSignals signal = TrafficSignals.valueOf("green".toUpperCase());
        boolean isGreen = signal.equals(TrafficSignals.GREEN);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        for (Country country : Country.values()) {
            if (country.getName().equalsIgnoreCase(text)) {
                System.out.println(country.getCapital().getName());

                try
                {
                    if (country.getCapital().has1M())
                    {
                        System.out.println("Too much people there.");
                    }
                } catch (IOException e)
                {
                    throw new NotNumberException("dvdvvdv");
                } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                    throw new Exception("Exception message", e);
                } catch (Exception e) {

                } finally
                {
                    System.out.println("done");
                }
            }
        }


        String choice;

        while (true){
            System.out.println("Menu:");
            System.out.println("1. sd");
            System.out.println("2. dd");
            System.out.println("3. fd");
            System.out.println("Make you choice: ");
            choice = scanner.next();

            switch (Integer.parseInt(choice)) {
                case 1: {
                    System.out.println("Hello");
                    break;
                }
                case 2: {
                    System.out.println("World");
                    break;
                }
                default: {
                    return;
                }
            }
        }
    }
}
