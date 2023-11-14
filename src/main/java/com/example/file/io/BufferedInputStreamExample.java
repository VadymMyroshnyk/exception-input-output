package com.example.file.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws Exception {
        try (FileInputStream fin = new FileInputStream("BufferedStreamExample.txt");
             BufferedInputStream bin = new BufferedInputStream(fin)) {

            System.out.println(bin.readAllBytes());

        }
    }
}
