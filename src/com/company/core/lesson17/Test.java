package com.company.core.lesson17;

@FunctionalInterface
public interface Test
{
    String value(int x, int y);

    default String test() {
        return "hekk";
    }
}
