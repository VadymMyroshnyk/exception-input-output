package com.example.file.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("BufferedExample.txt");
             BufferedReader br = new BufferedReader(fr)) {
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        }
    }
}
