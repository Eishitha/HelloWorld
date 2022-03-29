package com.example.sahitya.pkg29032022;

import java.lang.ThreadGroup;
public class Gfc {
    public static void main(String[] args) {
        ThreadGroup group1 = Thread.currentThread().getThreadGroup();

        ThreadAc t0 = new ThreadAc(group1, "thread1");
        ThreadAc t1= new ThreadAc(group1, "thread3");
        ThreadAc t2 = new ThreadAc(group1, "thread0");
        ThreadAc t3 = new ThreadAc(group1, "thread2");

        t0.start();
        t1.start();
        t2.start();
        t3.start();

        int count = group1.activeCount();
        System.out.println("Number of threads in group1 : " + count);

    }
}





