package com.example.sahitya.pkg28032022;

public class ThreadId extends Thread{
    public void run(){
        System.out.println("Id is printing");
    }

    public static void main(String[] args) {
        ThreadId t1 = new ThreadId();
        ThreadId t2 = new ThreadId();
        System.out.println("Name of the T1 : "+t1.getName());
        System.out.println("Id of the T1 : "+t1.getId());
        System.out.println("Name of the T2 : "+t2.getName());
        System.out.println("Id of the T2 : "+t2.getId());
    }
}


