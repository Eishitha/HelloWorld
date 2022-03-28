package com.example.sahitya.pkg28032022;

import java.lang.Thread;

public class SleepMethod extends Thread {
    public void run() {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(200);

            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SleepMethod s1 = new SleepMethod();
        SleepMethod s2 = new SleepMethod();
        s1.start();
        s2.start();
    }
}
