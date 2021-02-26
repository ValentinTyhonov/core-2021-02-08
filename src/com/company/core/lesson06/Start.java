package com.company.core.lesson06;

import java.util.Arrays;
import java.util.Locale;

public class Start
{
    public static void main(String[] args)
    {
        "test".equals("tesT"); // false
        "test".equalsIgnoreCase("tesT"); // true

        "test".charAt(1); // e

        "abc".compareTo("acd"); // 1
        "abc".compareTo("aaas"); // -1
        "aaa".compareTo("aaa"); // 0

        "test".endsWith("est"); // true
        "test".endsWith("t"); // true
        "test".endsWith("estt"); // false

        "test".startsWith("t"); // true
        "test".startsWith("test"); // true
        "test".startsWith("T"); // false

        "test".indexOf("t"); // 0
        "test".indexOf("es"); // 1
        "test".indexOf("eRs"); // -1

        String s = "Hello world, how are you?";
        String[] arr1 = s.split(" "); // [Hello, world,, how, are, you?]
        String[] arr2 = s.split(","); // [Hello world,  how are you?]


        System.out.println("test".substring(2)); // st
        System.out.println("test".substring(1, 3)); // es

        "test".contains("es"); // true
        "test".contains("ES"); // false

        "test    ".trim(); // 'test'
        "test   \t ".trim(); // 'test'
        "test   \n ".trim(); // 'test'
        System.out.println("    test   \n ".trim()); // 'test'
        System.out.println("    te   st   \n ".trim()); // 'te   st'

        "test".toUpperCase(); // TEST
        "TeSt".toLowerCase(); // test

        "test".isEmpty(); // false
        "".isEmpty(); // true
        " ".isEmpty(); // false

        "test".length(); // 4

        "test".replace("t", "a"); // aesa
        "test".replace("est", "aaa"); // taaa
        "test".replace("rest", "aaa"); // test

        StringBuilder builder = new StringBuilder("wqfsbweqsbvwes")
            .append("vwevew")
            .append("rvvew");

        builder.toString();

    }
}
