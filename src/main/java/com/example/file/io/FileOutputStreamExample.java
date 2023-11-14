package com.example.file.io;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        String text = "Welcome to java";

        try (FileOutputStream fout = new FileOutputStream("testout.txt")) {
            fout.write(text.getBytes());

            System.out.println("success...");
        } catch (Exception e) {
            throw new FileException(e);
        }
    }
}
