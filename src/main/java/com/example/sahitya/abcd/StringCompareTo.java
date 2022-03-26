package com.example.sahitya.abcd;

public class StringCompareTo {
    public static void main(String[] args) {
        String a1="pig";
        String a2 ="dog;" ;
        String a3 ="elephant";
        String a4 ="PIG";
        String a5 ="";
        System.out.println(a5.length());
        System.out.println(a4.length());
        System.out.println("sahitya".length());
        System.out.println("sahitya\n\t".length());
       System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
        System.out.println(a4.compareTo(a1));
        System.out.println(a2.compareTo(a4));
        System.out.println(a2.compareTo(a3));
        System.out.println(a1.compareToIgnoreCase(a4));
        System.out.println(a1.compareTo(a4));
    }
}
