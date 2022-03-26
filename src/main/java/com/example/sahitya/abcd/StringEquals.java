package com.example.sahitya.abcd;

public class StringEquals {
    public static void main(String[] args) {
        String st = "Array sum Average";
        String st1 = "ARRAY SUM AVERAGE";
        String st2 = "Array sum Average";
        String st3 = new String("Array sum Average");
        System.out.println(st==st2);
        System.out.println(st==st3);
        System.out.println(st==st1);
        System.out.println(st.equals(st3));
        System.out.println("\n");
       System.out.println(st.equals(st1));
        System.out.println(st.equalsIgnoreCase(st1));
        System.out.println(st.replace("sum","sound"));
    }
    }

