package com.example.sahitya.pkg29032022;

import java.lang.Thread;

public class ThreadJoin extends Thread{
    public void run(){
        for(int i=0;i<3;i++) {
            try {
                Thread.sleep(-300);
            } catch (InterruptedException e) {
                System.out.println("Everyone is fine");
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();
        t1.start();
        try{
            t1.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
            t2.start();
            t3.start();

    }
}
