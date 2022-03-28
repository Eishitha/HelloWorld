package com.example.sahitya.pkg28032022;

public class ThreadAlive extends Thread {
    public void run() {
        try {
            Thread.sleep(400);
            System.out.println("Is run() method Alive? : " + Thread.currentThread().isAlive());
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadAlive t1 = new ThreadAlive();
        System.out.println("Before Start function isAlive? : "+t1.isAlive());
        t1.start();
        System.out.println("After Start function isAlive? : "+t1.isAlive());
    }
}
