package com.example.sahitya.pkg30032022;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Count {
        public static void main(String[] args){

            List<Integer> numbers = new ArrayList<Integer>();
            numbers.add(100);
            numbers.add(110);
            numbers.add(120);
            numbers.add(15);
            numbers.add(12);
            System.out.println(numbers);
            Stream<Integer> t = numbers.stream();
            long count = t.count();
            System.out.println("Total Values = "+count);

        }
    }


