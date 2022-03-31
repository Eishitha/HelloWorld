package com.example.sahitya.pkg31032022;

import java.io.FileOutputStream;

public class FileOutput {
    public static void main(String[] args) {
            String data = "This is file output stream";

            try {
                FileOutputStream output = new FileOutputStream("output files");
                byte[] array = data.getBytes();
                output.write(array);
                output.close();
            }

            catch(Exception e) {
                System.out.println(e);
                e.getStackTrace();
            }
        }
    }
