package com.company.core.lesson08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Start
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>(list1);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(2, 4, 6, 6, 8));
        list3.addAll(list2);

        int min = list3.get(0);
        int max = list3.get(0);

        for (Integer num : list3) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }



        Iterator<Integer> iterator = list3.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == 4 || element == 6)
            {
                iterator.remove();
            }
        }
        System.out.println(list3);

        ListIterator<Integer> listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.nextIndex() == 1) {
                System.out.println(listIterator.next() + " will be removed");
                listIterator.remove();
            }
            System.out.println(listIterator.next());

        }

        while (listIterator.hasNext()) {
            System.out.println("Again " + listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex() + " " + listIterator.previous());
        }

    }
}
