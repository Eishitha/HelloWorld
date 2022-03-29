package com.example.sahitya.pkg29032022;

public class DaemonThread2 extends Thread{
    public DaemonThread2(String name){
        super();
    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName()+" is Daemon Thread");
        }
        else{
            System.out.println(getName()+" is user Thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread2 d1 = new DaemonThread2("t1");
        DaemonThread2 d2 = new DaemonThread2("t2");
        DaemonThread2 d3 = new DaemonThread2("t3");
        d1.setDaemon(true);
        d1.start();

        d2.start();


        d3.setDaemon(true);
        d3.start();

    }
}
