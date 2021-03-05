package com.company.core.lesson08;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2)
    {
        int result = o1.getSurname().compareTo(o2.getSurname());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
