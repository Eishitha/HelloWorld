package com.example.sahitya.abcd;
import java.util.*;

public class MainSortList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Guava");
        list1.add("Banana");
        list1.add("Watermelon");
        list1.add("Papaya");
        System.out.println("Given list1:\n"+list1);
        Collections.sort(list1);
        System.out.println("After sorting");
        for(String fruit : list1)
            System.out.println(fruit);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(89);
        numbers.add(91);
        numbers.add(12);
        numbers.add(57);
        System.out.println("\nGiven numbers:\n"+numbers);
        Collections.sort(numbers);
        System.out.println("After sorting");
        for(Integer data: numbers)
            System.out.println(data);
            }
        }



