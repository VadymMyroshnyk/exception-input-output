package com.example.file.nio.write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TestClass {

    public static void main(String[] args) throws IOException {
        Files.write(Path.of("test.txt"), "new".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
