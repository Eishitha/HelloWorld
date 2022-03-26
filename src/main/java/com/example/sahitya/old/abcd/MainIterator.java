package com.example.sahitya.old.abcd;

import java.util.Iterator;
import java.util.Vector;

public class MainIterator {
    public static void main(String[] args) {
        Vector<String> insects = new Vector<>();
        insects.add("Ant");
        insects.add("HoneyBee");
        insects.add("HouseFly");
        insects.add("Mosquito");
        insects.add("Spider");
        Iterator<String> it = insects.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
