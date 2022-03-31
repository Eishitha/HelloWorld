package com.example.sahitya.pkg31032022;

import java.io.File;

public class FileInformation {
            public static void main(String[] args) {
                File obj = new File("name");
                if (obj.exists()) {
                    System.out.println("File name: " + obj.getName());
                    System.out.println("Absolute path: " + obj.getAbsolutePath());
                    System.out.println("Writeable: " + obj.canWrite());
                    System.out.println("Readable: " + obj.canRead());
                    System.out.println("File size in bytes: " + obj.length());
                    System.out.println("Executable: " + obj.canExecute());

                }
                else {
                    System.out.println("The file does not exist.");
                }
            }
        }


