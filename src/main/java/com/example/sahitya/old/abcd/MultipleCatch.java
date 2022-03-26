package com.example.sahitya.old.abcd;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int[] a = new int[7];
           // int b = 23/0;
            System.out.println(a[10]);
        }
        catch (ArithmeticException e){
            System.out.println("DIVISION IS NOT POSSIBLE IN THIS SCENARIO ");
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Given Array index is out of given range");
        }
        System.out.println("Today is monday.so it is not possible to provide holiday");
    }
}
