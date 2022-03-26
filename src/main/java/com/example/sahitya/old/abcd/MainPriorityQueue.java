package com.example.sahitya.old.abcd;

import java.util.PriorityQueue;

public class MainPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> sh = new PriorityQueue<>();
        sh.add(10);
        sh.add(6);
        System.out.println("Priority Queue : "+sh);

        sh.add(20);
        System.out.println(" Updated Priority Queue : "+sh);

        int no=sh.peek();
        System.out.println("Accessed element using peek : "+no);

        int no1 = sh.size();
        System.out.println("Size of the sh : "+no1);

        int no2 = sh.remove();
        System.out.println("removed element: "+no2);
        System.out.println("Second Updated Queue:"+sh);

        int no3=sh.element();
        System.out.println("Accessed element using element : "+no3);



    }
}
