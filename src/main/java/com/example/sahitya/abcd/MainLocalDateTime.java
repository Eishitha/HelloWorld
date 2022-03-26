package com.example.sahitya.abcd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MainLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime o2 = LocalDateTime.now();
        System.out.println(o2);

        LocalDateTime t1 = LocalDateTime.of(2020,1,4,3,5,23,345678);
        System.out.println(t1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String st =o2.format(dtf);
        System.out.println(o2.format(dtf));

        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime utc = LocalDateTime.now().atZone(ZoneId.of("UTC"));
        System.out.println(utc);
    }
}
