package com.example.sahitya.old.abcd;

import java.util.ArrayList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(24);
        numbers.add(21);
        numbers.add(1);
        System.out.println("List: "+numbers);
        System.out.println("Accessed element: "+numbers.get(2));
        int result = numbers.remove(1);
        System.out.println("Removed Element: "+result);

    }
}
