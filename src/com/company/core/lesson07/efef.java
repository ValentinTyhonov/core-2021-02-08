package com.company.core.lesson07;

import java.util.Arrays;

public class efef
{

    public static void main(String[] args)
    {
        int[] arr = {1, 2 , 3, 4, 5, 6};
        int[] arrReversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            arrReversed[arr.length - 1 - i] = arr[i];
        }

        System.out.println(Arrays.toString(arrReversed));

    }
}
