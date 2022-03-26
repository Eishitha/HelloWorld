package com.example.sahitya.old.abcd;

public class StringContains {
    public static void main(String[] args) {
       String st = "Learn java.it is fantastic";
        System.out.println(st.contains("L"));
        System.out.println(st.contains("is"));
        System.out.println(st.contains("Learning"));
        System.out.println(st.contains("fantastic"));
        System.out.println(st.indexOf('e'));
        System.out.println(st.indexOf('f'));
        System.out.println(st.indexOf('a',9));
        System.out.println(st.indexOf('t',10));
    }
}
