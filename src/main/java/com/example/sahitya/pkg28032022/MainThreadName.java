package com.example.sahitya.pkg28032022;


import java.lang.Thread;


public class MainThreadName extends Thread {
    public static void main(String[] args) {
        MainThreadName Thread = new MainThreadName();
        Thread.setName("My Thread");
        Thread.start();
        String st = Thread.getName();
        System.out.println(st);

    }
}
