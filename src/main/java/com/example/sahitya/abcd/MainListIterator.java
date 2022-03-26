package com.example.sahitya.abcd;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainListIterator {
    public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(12);
            numbers.add(1);
            numbers.add(78);
            numbers.add(30);

            ListIterator<Integer> iterate = numbers.listIterator();
            iterate.next();
            iterate.next();
            iterate.next();

            int val = iterate.previous();
            System.out.println("Previous Value: "+val);

            int val2= iterate.previousIndex();
            System.out.println("Previous Index: "+val2);

            int val3= iterate.nextIndex();
            System.out.println("Previous Index: "+val3);

    }
    }

