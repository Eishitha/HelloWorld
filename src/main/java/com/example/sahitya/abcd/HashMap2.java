package com.example.sahitya.abcd;

import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> noteBook = new HashMap<>();
        noteBook.put("Spiral",50);
        noteBook.put("Novelty",20);
        noteBook.put("Business",100);
        noteBook.put("Composition",30);
        noteBook.put("Lab",180);
        System.out.println("Available Notebooks : "+noteBook);

        int book1 = noteBook.computeIfPresent("Composition",(Key, Value) ->Value = 500 );
        System.out.println("Updated cost: "+book1);
        System.out.println("Modified Notebooks : "+noteBook);

        assert noteBook.get("Lab")==150:"Cost is varied";
    }
}
