package com.example.sahitya.pkg28032022;

public class GetPriority extends Thread {
    public void run(){
        System.out.println("Running thread name : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        GetPriority g1= new GetPriority();
        GetPriority g2= new GetPriority();
        GetPriority g3= new GetPriority();
        g1.start();
        System.out.println("Priority of g1: "+g1.getPriority());
        g2.start();
        System.out.println("Priority of g2: "+g2.getPriority());
        g3.start();
        System.out.println("Priority of g3: "+g3.getPriority());
    }
}
