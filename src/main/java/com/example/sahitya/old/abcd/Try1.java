package com.example.sahitya.old.abcd;

public class Try1 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data1;
        try{
            data1 = i/j;
        }
        catch(ArithmeticException e){
          //  System.out.println(e);
            int data2 = 50/0;
        }
       finally{
            System.out.println("DIVIDE BY ZERO IS NOT POSSIBLE");
            System.out.println(i/(j+(5)));
        }
    }
}
