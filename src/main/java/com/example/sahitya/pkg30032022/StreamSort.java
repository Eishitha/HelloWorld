package com.example.sahitya.pkg30032022;

import java.util.*;
import java.util.stream.*;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> num =Arrays.asList(18,89,24,9,23,57);
        List<Integer> order =num.stream().sorted().collect(Collectors.toList());
        System.out.println(order);

        List<String> word =Arrays.asList("Pen","Eraser","Scale","Book");
        List<String> next_order =word.stream().sorted().collect(Collectors.toList());
        System.out.println(next_order);

        int even = num.stream().filter(X->X%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);
    }
}

