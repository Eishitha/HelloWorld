package com.example.sahitya.pkg29032022;

import java.lang.ThreadGroup;
public class ThreadAc extends Thread {
    public ThreadAc(java.lang.ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(24);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed executing");
    }
}




