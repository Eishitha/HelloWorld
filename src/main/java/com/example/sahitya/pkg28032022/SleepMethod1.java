package com.example.sahitya.pkg28032022;

import java.lang.Thread;

public class SleepMethod1 extends Thread {
    public void run() {
        for(int i=0;i<=3;i++){
            try{
                Thread.sleep(-100);

            }
            catch(InterruptedException e){
                System.out.println(e);
           }

            System.out.println(i + 100);
        }
    }
    public static void main(String[] args) {
        SleepMethod1 t1 = new SleepMethod1();
        SleepMethod1 t2 = new SleepMethod1();
        SleepMethod1 t3 = new SleepMethod1();
        t1.start();
        t2.start();
        t3.start();
    }
}

