package com.example.sahitya.old.abcd;

import java.util.HashMap;

public class MainHashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors = new HashMap<>();
         colors.put(1,"Blue");
         colors.put(2,"Yellow");
         colors.put(3,"Pink");
         colors.put(4,"Violet");
         colors.put(5,"Grey");
         colors.put(6,"Brown");
         System.out.println("HashMap1 Items: "+colors);

        colors.compute(1,(key, Value) -> Value= Value.concat(" Ink"));
        colors.compute(5,(key, Value) -> Value= Value+" Eyes");
        System.out.println("Updated HashMap Items: "+colors);

        String s =colors.computeIfAbsent(7,Key ->"White");
        System.out.println("Returned Value: "+s);
        System.out.println("Updated HashMap Items list1: "+colors);

        String s1 =colors.computeIfAbsent(4,Key ->"Purple");
        System.out.println("Returned Value: "+s1);
        System.out.println("\n Updated HashMap Items list2: "+colors);

        String s2 =colors.computeIfAbsent(7,null);
        System.out.println("Returned Value: "+s2);
        System.out.println("Updated HashMap Items list1: "+colors);
    }
}
