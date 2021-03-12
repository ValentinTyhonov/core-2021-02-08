package com.company.core.lesson09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.company.core.lesson08.Person;
import com.company.core.lesson08.PersonComparator;

public class Start
{
    public static void main(String[] args)
    {
        Set<Person> set = new TreeSet<>(Comparator.reverseOrder());

        Set<String> set1 = new HashSet<>(Arrays.asList("fw", "eq"));

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(1);
        queue.add(8);
        queue.add(5);

        System.out.println(queue);

//        queue.remove();

        System.out.println(queue);

//        queue.poll();
        queue.add(3);
        System.out.println(queue);
        queue.add(7);
        System.out.println(queue);
        queue.offer(2);
        System.out.println(queue);
        queue.add(66);
        System.out.println(queue);

    }
}
