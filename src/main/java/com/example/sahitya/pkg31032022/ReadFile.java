package com.example.sahitya.pkg31032022;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream("Name");
            System.out.println("Data present in the file : ");
            int i = f1.read();

            while(i != -1){
                System.out.println(i);
            System.out.println((char)i);
            i= f1.read();
            }

           f1.close();

        }
        catch (Exception e){
            System.out.println("File is not available");
            e.printStackTrace();
        }
    }
}
