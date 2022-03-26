package com.example.sahitya.old.abcd;

import java.util.HashMap;

public class MainHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> icecreams = new HashMap<>();
        System.out.println("Initial Icecreams : " + icecreams);
        icecreams.put("Red velvet",1);
        icecreams.put("Chocolate",3);
        icecreams.put("vanilla",2);
        icecreams.put("ButterScotch",4);
        System.out.println("HashMap items  : "+icecreams);
        System.out.println("Keys :  "+icecreams.keySet());
        System.out.println("Values : "+icecreams.values());
        System.out.println("key/values: "+icecreams.entrySet());
        icecreams.putIfAbsent("Strawberry",5);
        System.out.println("Latest Icecreams : "+icecreams);

    }
}
