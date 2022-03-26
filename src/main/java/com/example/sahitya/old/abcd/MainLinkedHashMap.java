package com.example.sahitya.old.abcd;

import java.util.LinkedHashMap;

public class MainLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> student = new LinkedHashMap<>();
         student.put("Akshara",24);
         student.put("Saravani" ,20);
         student.put("Akshitha", 22);
         student.put("Alekhya" ,19);
         student.put("Neelima" ,12);
         student.put("Tejasri" ,14);
         student.put("Pravallika" ,2);
         student.put("Jyothi" ,18);
          System.out.println("Students and their marks : "+student);
         int value1= student.get("Tejasri");
         System.out.println("Returned no: "+value1);
         int value2 = student.getOrDefault("Pravika",25);
        System.out.println("Returned no: "+value2);
    }
}
