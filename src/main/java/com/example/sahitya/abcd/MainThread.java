package com.example.sahitya.abcd;

import java.lang.Thread;

public class MainThread extends Thread {
    public static void main(String[] args) {
        MainThread thread = new MainThread();
        thread.start();
        System.out.println(" code is outside of the thread");
    }
    public void run() {
        System.out.println(" code is running in a thread");
    }
}