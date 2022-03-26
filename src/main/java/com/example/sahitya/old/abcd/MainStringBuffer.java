package com.example.sahitya.old.abcd;

public class MainStringBuffer {
    String name;

    public MainStringBuffer(String name) {
        this.name = name;
      System.out.println(name);
    }
    public void app(String name1){
        name = name.concat(name1);
        System.out.println(name);
    }

    public static void main(String[] args) {

        MainStringBuffer str = new MainStringBuffer("APPLE");
         str.app("AP");
    }
}
