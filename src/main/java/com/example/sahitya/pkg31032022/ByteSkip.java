package com.example.sahitya.pkg31032022;

import java.io.FileInputStream;
import java.io.FileWriter;

public class ByteSkip {
    public static void main(String[] args) {
        try {
            FileInputStream msg = new FileInputStream("Name");
            msg.skip(36);
            System.out.println("Message after 36 skips : ");
            int i = msg.read();
            while (i != -1) {
                System.out.println((char) i);

                i = msg.read();
            }
            msg.close();

        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
