package com.example.sahitya.pkg30032022;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MapNames {

        public static void main(String[] args) {
            List<String> names = Arrays.asList("Pen","pencil","eraser","book","shelf","sharpener");
            names.stream().map(String::toUpperCase).forEach(System.out::println);
        }
    }

