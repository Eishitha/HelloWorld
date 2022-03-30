package com.example.sahitya.pkg30032022;

import java.util.*;
import java.util.stream.*;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Visakhapatnam","Warangal","Vijayawada");
        List<String> famous = cities.stream().filter(w->w.startsWith("V")).collect(Collectors.toList());
        System.out.println(famous);

        List<String> letter = Arrays.asList("Buy","Bay","Shy","sam","why","Was");
        List<String> words= letter.stream().filter(w->w.endsWith("y")).collect(Collectors.toList());
        System.out.println(words);


    }
}
