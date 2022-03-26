package com.example.sahitya.abcd;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(89);
        numbers.add(75);
        numbers.add(61);
        numbers.add(90);
        numbers.add(45);
        numbers.add(50);
        System.out.println("Given numbers: "+numbers);

        System.out.println("Using higher: "+ numbers.higher(75));
        System.out.println("Using lower: "+ numbers.lower(61));

        assert numbers.lower(61)==50:"This is Smallest";

    }
}
