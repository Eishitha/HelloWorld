package com.example.sahitya.abcd;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<Integer> no = new Stack<>();
        no.push(23);
        no.push(20);
        no.push(10);
        no.push(39);
        System.out.println("Given Elements: "+no);
        int no1 = no.peek();
        System.out.println("Peeked Element from top of Stack "+no1);
        int number = no.pop();
        System.out.println("Removed item: "+number);
        System.out.println("Modified Elements: "+no);
        int position = no.search(20);
        System.out.println("Position of 20 is displayed as  "+position);
        boolean result =no.isEmpty();
        System.out.println("Is Stack Empty? ");
        System.out.println(result);
    }
}
