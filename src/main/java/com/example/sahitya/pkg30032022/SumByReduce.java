package com.example.sahitya.pkg30032022;

import java.util.*;
import java.util.stream.*;
import java.util.List;

public class SumByReduce {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(11, 20, 3, 4, 5);
        Integer sum = num.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
