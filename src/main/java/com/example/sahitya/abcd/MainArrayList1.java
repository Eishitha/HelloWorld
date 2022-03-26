package com.example.sahitya.abcd;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList1 {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Cauliflower");
        vegetables.add("Chillies");
        vegetables.add("BottleGuard");
        System.out.println("Given vegetables : "+vegetables);
        System.out.println(vegetables.indexOf("Cabbage"));
        System.out.println(vegetables.indexOf("Chillies"));
        vegetables.removeAll(vegetables);
        System.out.println("Remaining Vegetables : "+vegetables);
    }
}
