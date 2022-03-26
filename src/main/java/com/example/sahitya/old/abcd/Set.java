package com.example.sahitya.old.abcd;

import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet1 = new TreeSet<>();
        numberSet1.add(23);
        numberSet1.add(12);
        numberSet1.add(23);
        numberSet1.add(38);
        System.out.println("Number Set1 Items: "+numberSet1);

        TreeSet<Integer> numberSet2 = new TreeSet<>();
        numberSet2.add(23);
        numberSet2.add(12);
        numberSet2.add(32);
        numberSet2.add(83);
        System.out.println("Number Set2 Items: "+numberSet2);

        numberSet1.retainAll(numberSet2);
        System.out.println("Intersection of 2 given Set of Numbers: "+numberSet1);

        numberSet1.addAll(numberSet2);
        System.out.println("Union of 2 given Set of Numbers: "+numberSet1);

        TreeSet<Integer> numberSet3 = new TreeSet<>();
        numberSet3.add(23);
        numberSet3.add(12);
        numberSet3.add(32);
        numberSet3.add(83);
        numberSet3.add(10);
        boolean result =numberSet3.containsAll(numberSet2);
        System.out.println(result);

        assert numberSet1.containsAll(numberSet3):"Both are different sets";
    }
}
