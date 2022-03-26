package com.example.sahitya;

public class Addition {
    static int add(int x,int y){
        return x+y;
    }
    static double add(double x, double y){
        return x + y;
    }
    public static void main(String[] args){
        int z=add(13,7);
        double  w=add(2.61,2.01);
        System.out.println("int " +z);
        System.out.println("float " +w);

    }

}
