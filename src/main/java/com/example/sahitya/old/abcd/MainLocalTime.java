package com.example.sahitya.old.abcd;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class MainLocalTime {
    public static void main(String[] args) {
        LocalTime o1=LocalTime.now();
        System.out.println(o1);

        Instant i = Instant.now();
        System.out.println(i);

        for(String s :ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
    }
}
