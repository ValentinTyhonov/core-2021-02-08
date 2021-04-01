package com.company.core.lesson16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Start
{
    public static void main(String[] args) throws NoSuchFieldException
    {
        Class deviceClass = Device.class;

        System.out.println(deviceClass.getDeclaredField("count").getAnnotation(Useless.class).name());
        System.out.println(deviceClass.getDeclaredField("count").getAnnotation(Useless.class).value());


        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date1 = LocalDate.of(2000, 12, 11);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2020-12-11");
        System.out.println(date2);

        System.out.println(date1.isBefore(date2));

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("E, dd M yyyy HH:mm:ss.SSSS")));


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss z")));


        Date simpleDate = new Date();
        System.out.println(simpleDate);

        LocalDateTime parsed = LocalDateTime.ofInstant(simpleDate.toInstant(), ZoneId.of("UTC"));
        System.out.println(parsed);
    }

}
