package com.example.sahitya.abcd;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{2, 3, 4, 5}, {4, 10, 1, 9}, {8, 99}};
        for (int[] innerA : array) {
            for (int d : innerA) {
                System.out.println(d);
            }
        }
    }
}
