package com.example.sahitya.old.abcd;

import java.util.ArrayDeque;
import java.util.Iterator;

public class MainArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> things = new ArrayDeque<>();
        things.add("Pen");
        things.addLast("Ball");
        things.addFirst("Eraser");
        System.out.println("Things are "+things);

        String t1 = things.getFirst();
        System.out.println("First thing is "+t1);

        String t2 = things.getLast();
        System.out.println("Last thing is "+t2);
        System.out.println("\n");

        Iterator<String> desIterate = things.descendingIterator();
        while(desIterate.hasNext()){
        System.out.println(desIterate.next());
        }

        things.clear();
        System.out.println("Latest things : "+things);
    }
}
