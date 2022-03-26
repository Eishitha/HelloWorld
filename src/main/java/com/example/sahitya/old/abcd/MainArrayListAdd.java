package com.example.sahitya.old.abcd;

import java.util.ArrayList;

public class MainArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("JAVA");
        languages.add("PYTHON");
        languages.add("C");
        languages.add("SCALA");
        System.out.println("Given ArrayList: "+languages);
        languages.add(1,"HTML");
        System.out.println("Modified ArrayList: "+languages);
        languages.set(2,"SWIFT");
        System.out.println("Final ArrayList: "+languages);



    }
}
