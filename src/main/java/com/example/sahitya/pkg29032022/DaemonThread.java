package com.example.sahitya.pkg29032022;

public class DaemonThread extends Thread{
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName());
        System.out.println("Check the thread is Daemon or not? "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonThread d1 = new DaemonThread();
        DaemonThread d2 = new DaemonThread();
        d1.start();
        d1.setDaemon(true);
        d2.start();
    }
}
