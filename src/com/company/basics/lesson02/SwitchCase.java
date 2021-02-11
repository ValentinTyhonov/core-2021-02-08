package com.company.basics.lesson02;

public class SwitchCase
{


    public static void main(String[] args)
    {
        String day = "Wed";

        switch (day) {
            case "Mon": {
                System.out.println("Wake up");
                break;
            }
            case "Tue": {
                System.out.println("Brush teeth");
                break;
            }
            case "Wed": {
                System.out.println("3");
                break;
            }
            case "Thu": {
                System.out.println("4");
                break;
            }
            default: {
                System.out.println("Incorrect value");
            }
        }

        int i = 4;
        switch (i) {
            case 1: {
                System.out.println("Wake up");
                break;
            }
            case 2: {
                System.out.println("Brush teeth");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            case 4: {
                System.out.println("4");
                break;
            }
            default: {
                System.out.println("Incorrect value");
            }
        }
    }
}
