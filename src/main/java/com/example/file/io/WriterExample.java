package com.example.file.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

    public static void main(String[] args) throws IOException {
        try (Writer writer = new FileWriter("output.txt")) {
            String content = "Test writer";
            writer.write(content);
        }
    }
}
