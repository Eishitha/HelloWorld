package com.example.sahitya.abcd;

public class Throw {
    public static void main(String[] args) {
        try {
            int age=18;
            if (age < 18) {
                throw new ArithmeticException();
            } else {
                System.out.println("YOU ARE ELIGIBLE FOR VOTING");
            }
        } catch (ArithmeticException e) {
            System.out.println("YOU NEED SOMETIME FOR THE ELIGIBILITY");
        }
    }
}
