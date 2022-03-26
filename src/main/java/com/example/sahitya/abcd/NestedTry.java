package com.example.sahitya.abcd;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int[] array = {1, 2, 3, 4, 5};
                    System.out.println(array[19]);
                } catch (ArithmeticException e) {
                    System.out.println("Division is not possible");
                }
            } catch (ArithmeticException e1) {
                System.out.println("Division is not possible");
            }
        } catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println(e3);
            System.out.println("Range is running out");
        }
    }
}
