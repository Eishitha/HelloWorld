package com.example.sahitya.old.abcd;

import java.util.LinkedList;
import java.util.Queue;

public class MainLinkedList {
    public static void main(String[] args) {
        Queue<Integer> list1 = new LinkedList<>();
        list1.offer(89);
        list1.offer(12);
        list1.offer(41);
        System.out.println("Given List1: "+list1);
        int a_no = list1.peek();
        System.out.println("Accessed Element: " +a_no);
        int r_no = list1.poll();
        System.out.println("Removed Element: " +r_no);
        System.out.println("Modified Queue :"+list1);
        System.out.println("\n");

        int aa_no = list1.element();
        System.out.println("Second Accessed element: "+aa_no);
        int rr_no = list1.remove();
        System.out.println("Removed Element: " +rr_no);
        System.out.println("Updated Queue :"+list1);
        list1.add(56);
        System.out.println("Final List1 : "+list1);

    }
}
