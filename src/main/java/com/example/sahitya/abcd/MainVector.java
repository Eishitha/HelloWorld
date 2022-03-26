package com.example.sahitya.abcd;

import java.util.Vector;
public class MainVector {
    public static void main(String[] args) {
        Vector<Integer> v= new Vector<>();
        v.add(23);
        v.add(12);
        v.add(78);
        v.add(23);
        System.out.println("Vector elements :"+v);
        boolean result = v.isEmpty();
        System.out.println(result);
        Vector<Integer> myno = new Vector<>();
        myno.add(37);
        myno.addAll(v);
        System.out.println("New vector elements :"+myno);
        int length = v.size();
        System.out.println(length);
        System.out.println(v.remove(2));
        System.out.println("After removing : "+v);
        v.clear();
        System.out.println("After Clearing: "+v);
        boolean result1 = v.isEmpty();
        System.out.println(result1);
    }
}
