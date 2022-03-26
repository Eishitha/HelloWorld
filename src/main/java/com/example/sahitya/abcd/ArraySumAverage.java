package com.example.sahitya.abcd;

public class ArraySumAverage {
    public static void main(String[] args) {


        int[] numbers= {125, 10, 6, 8, 12, 18, 4};
        int sum = 0;
        int arrayLength = numbers.length;
        for (int i :numbers) {
            sum = sum + i;
        }
        System.out.println("SUM:"+sum);

        System.out.println("LENGTH:"+arrayLength);

       double average =(double)sum/(double)arrayLength;
       System.out.println("AVERAGE OF GIVEN NUMBERS IS " +average);

    }
}
