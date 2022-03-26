package com.example.sahitya.old.abcd;

public class Exception {
    public static void main(String[] args) {
        try{
            int[] array = {1,2,3,4};
            System.out.println(array[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("IT IS OUT OF ARRAY");
        }
        finally{
            System.out.println("EVERYTHING IS NOT GOOD.WE HAVE TO SOLVE EVERYTHING");
        }
    }
}
