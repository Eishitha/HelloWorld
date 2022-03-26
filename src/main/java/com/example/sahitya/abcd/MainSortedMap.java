package com.example.sahitya.abcd;

import java.util.SortedMap;
import java.util.TreeMap;

public class MainSortedMap {
    public static void main(String[] args) {
        SortedMap<Integer,String> numbers = new TreeMap<>();
        numbers.put(1,"One");
        numbers.put(2,"Two");
        numbers.put(4,"Four");
        numbers.put(6,"Six");
        numbers.put(20,"Twenty");
        System.out.println("Sorted Map: "+numbers);

        int first = numbers.firstKey();
        assert first==3:"found Exception";
        System.out.println("Head Map values: "+numbers.headMap(6));
        System.out.println("Tail Map values: "+numbers.tailMap(4));
    }
}
