package com.example.sahitya.abcd;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MainConcurrentHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> even_no = new HashMap<>();
        even_no.put(2,"Two");
        even_no.put(16,"Sixteen");
        even_no.put(12,"Twelve");
        System.out.println("Even numbers: "+even_no);

        ConcurrentHashMap<Integer,String> odd_no = new ConcurrentHashMap<>();
        odd_no.put(7,"Seven");
        odd_no.putAll(even_no);
        System.out.println("All numbers : "+odd_no);
        String value= odd_no.get(12);
        System.out.println(value);
        assert value =="Twe":"Number is wrong";

    }
}
