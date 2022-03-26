package com.example.sahitya.old.abcd;

public class Rectangle implements Polygon {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("AREA  " + (length * breadth));
        //System.out.println("AREA OF RECTANGLE 2" + (length * breadth));
       // System.out.println("AREA OF RECTANGLE 3" + (length * breadth));
    }

//    public void area() {
//        // do nothing
//    }

//    public int lala() {
//        return 2;
//    }

}
