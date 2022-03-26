package com.example.sahitya.old.abcd;

import java.util.*;
public class MainNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> chocolates = new TreeMap<Integer, String>();
        chocolates.put(10,"Dairy Milk");
        chocolates.put(20,"Perk");
        chocolates.put(5,"star");
        chocolates.put(30,"MilkyBar");
        chocolates.put(40,"Dark chocolates ");
        chocolates.put(50,"Snickers");
       System.out.println("Available chocolates :"+chocolates);
        System.out.println(chocolates.ceilingEntry(5));
        int entry1 = chocolates.higherKey(20);
        assert entry1 == 10:"Cheap";
        }
    }
