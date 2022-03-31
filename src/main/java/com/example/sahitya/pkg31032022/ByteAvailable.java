package com.example.sahitya.pkg31032022;

import java.io.FileInputStream;

public class ByteAvailable {
    public static void main(String[] args) {
        try {
            byte[] array = new byte[100];
            FileInputStream f1 = new FileInputStream("Name");
            System.out.println("no of bytes available:  " + f1.available());
            f1.read();
            f1.read();
            f1.read();
            f1.read();
            System.out.println("no of bytes available:  " + f1.available());

        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
