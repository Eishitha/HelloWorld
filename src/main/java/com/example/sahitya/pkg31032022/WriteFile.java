package com.example.sahitya.pkg31032022;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter msg = new FileWriter("Name");
            msg.write("Writing is done by using File Writer.it is a FileWriter");
            msg.close();
            System.out.println("Writing process is done successfully");
        }
        catch (IOException e){
            System.out.println("An error is occurred");
            e.printStackTrace();
        }
    }
}
