package com.example.file.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {
        try (FileWriter writer = new FileWriter("BufferedExample.txt");
             BufferedWriter buffer = new BufferedWriter(writer)) {
            buffer.write("Welcome to java.");
        }
    }
}
