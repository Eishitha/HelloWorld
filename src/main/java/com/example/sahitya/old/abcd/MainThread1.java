package com.example.sahitya.old.abcd;

import java.lang.Thread;

    public class MainThread1 implements Runnable {
        public static void main(String[] args) {
            MainThread1 obj = new MainThread1();
            Thread thread = new Thread(obj);
            thread.start();
            System.out.println("code is outside of the threadd");
        }
        public void run() {
            System.out.println(" code is running in a thread");
        }
    }



