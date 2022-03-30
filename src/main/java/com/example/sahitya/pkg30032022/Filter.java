package com.example.sahitya.pkg30032022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1200);
        numbers.add(300);
        numbers.add(1100);
        numbers.add(120);
        numbers.add(1030);
        numbers.add(5300);

        List<Integer> bigger =numbers.stream().filter(X->X>300).collect(Collectors.toList());
        System.out.println(bigger);

        Set<Integer> num = numbers.stream().collect(Collectors.toSet());
        System.out.println("Set values: "+num);


    }
}
