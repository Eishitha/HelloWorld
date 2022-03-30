package com.example.sahitya.pkg30032022;

import java.util.*;
import java.util.stream.*;

public class MinAndMax {
    public static void main(String[] args) {
        int max=Stream.of(2,34,35,90).max(Comparator.comparing(String::valueOf)).get();
        int min =Stream.of(2,34,35,90).min(Comparator.comparing(String::valueOf)).get();
        System.out.println(max);
        System.out.println(min);

    }
}
