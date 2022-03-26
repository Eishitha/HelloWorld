package com.example.sahitya.old.abcd;

public class StringCharAt1 {
    public static void main(String[] args) {
        String sam= "YOU HAVE TO PRESS CONTROL PLUS SHIFT TO GET THE KEYBOARD TO NORMAL STATE";
        for(int i=0;i<sam.length();i++) {
            if (i % 2 != 0) {
                System.out.println("character at " + i + " is " + sam.charAt(i));
            }
        }
            int count =0;
            for(int j=0;j<sam.length();j++) {
                if ( sam.charAt(j)=='Y'){
                    count++;
                }
            }
            System.out.println("FREQUENCY OF Y IS " +count);
    }
}
