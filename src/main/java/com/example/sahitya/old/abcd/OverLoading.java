package com.example.sahitya.old.abcd;

public class OverLoading {
    public  void display(int a){
        System.out.println("THE LUCKY NUMBER IS "+a);
    }
    public  void display(String name){
        //display(name);
        System.out.println("MY NAME IS "+name);
    }
    public void display(double days){
        System.out.println("I AM "+days+" Years old");
    }

    public static void main(String[] args) {
        OverLoading ov = new OverLoading();
        ov.display(2);
        ov.display("SAHITYA Pentakota");
        ov.display(45678.91);
    }
}
