package com.example.sahitya.pkg29032022;

public class ThreadCheckAccess extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+" execution is completed");
    }

    public static void main(String[] args) {
        ThreadCheckAccess ca1 = new ThreadCheckAccess();
        ThreadCheckAccess ca2 = new ThreadCheckAccess();
        ca1.start();
        ca2.start();
        ca1.checkAccess();
        ca2.checkAccess();
        System.out.println(ca1.getName() + " has access");
        System.out.println(ca2.getName() + " has access");


    }
}
