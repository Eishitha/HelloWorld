package com.example.sahitya.old.abcd;

import java.util.TreeSet;
import java.util.SortedSet;

public class MainSortedSet {
    public static void main(String[] args) {
            SortedSet<Integer> numbers = new TreeSet<>();
            numbers.add(40);
            numbers.add(78);
            numbers.add(67);
            numbers.add(56);
            numbers.add(99);
            numbers.add(200);
            System.out.println("Given numbers: "+numbers);
        for(int number:numbers){
            System.out.println(number);
        }
        assert numbers.last()==20:"It is a Wrong number";
    }
}
