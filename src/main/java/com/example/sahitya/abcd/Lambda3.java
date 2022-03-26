package com.example.sahitya.abcd;

public class Lambda3 {
    public static void main(String[] args) {
        Message m = (msg) -> {
            String st1 = "Iime and Tide wait for none. ";
            String st2 = st1 + msg;
            return st2;
        } ;
        System.out.println(m.display("It is absolutely correct"));
    }
}
