package com.example.file.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

    public static void main(String[] args) throws Exception {
        String text = "Welcome to java";

        try (FileOutputStream fout = new FileOutputStream("BufferedStreamExample.txt");
             BufferedOutputStream bout = new BufferedOutputStream(fout)) {
            byte[] b = text.getBytes();
            bout.write(b);
            bout.flush();
            System.out.println("success");
        }
    }
}
