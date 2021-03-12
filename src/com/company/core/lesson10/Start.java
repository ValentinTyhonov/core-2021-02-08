package com.company.core.lesson10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import com.company.core.lesson08.Person;

public class Start
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Monday", 124);
        map.put("Tuesday", 2332);
        map.put("Wednesday", 234);
        map.put("Sunday", 39);
        map.put("Tuesday", 0);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key - " + entry.getKey() + "; value - " + entry.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Integer val : map.values()) {
            System.out.println(val);
        }

        System.out.println(map.containsKey("Sunday"));
        System.out.println(map.get("Sunday"));

    }
}
