package com.example.sahitya.pkg28032022;

public class ThreadPriority extends Thread {
    public void run(){
            System.out.println("Threads are running");
    }

    public static void main(String[] args) {
        ThreadPriority p1 = new ThreadPriority();
        ThreadPriority p2 = new ThreadPriority();
        ThreadPriority p3 = new ThreadPriority();
        ThreadPriority p4 = new ThreadPriority();
        p1.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.setPriority(Thread.MIN_PRIORITY);
        p3.setPriority(8);
        p4.setPriority(Thread.NORM_PRIORITY);
        System.out.println("Priority of thread t1 is: " + p1.getPriority());
        System.out.println("Priority of thread t2 is: " + p2.getPriority());
        System.out.println("Priority of thread t2 is: " + p3.getPriority());
        System.out.println("Priority of thread t2 is: " + p4.getPriority());

    }
}
