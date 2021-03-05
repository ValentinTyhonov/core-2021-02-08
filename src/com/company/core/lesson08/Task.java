package com.company.core.lesson08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(64);
        numbers.add(94);
        numbers.add(18);
        numbers.add(5);


        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            numbers.set(listIterator.nextIndex(), listIterator.next() * 5 + 1);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > 300) {
//                iterator.remove();
            } else {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
    }
}
