package com.example.sahitya.pkg30032022;

import java.util.*;
import java.util.stream.*;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(2,5,4,6,7);
        List<Integer> cube = numbers.stream().map(X->X*X*X).collect(Collectors.toList());
        System.out.println(cube);

        List<Integer> no = Arrays.asList(20,4,5,6,25);
        List<Integer> multiply=no.stream().map(X->X*5+2).collect(Collectors.toList());
        System.out.println(multiply);

        numbers.stream().map(X->X*X*X).forEach((y)->System.out.println(y));
        no.stream().map(X->X*5+2).forEach((y)->System.out.println(y));


    }

}
