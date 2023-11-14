package com.example.file.nio.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestClass {

    public static void main(String[] args) throws IOException {
        Files.copy(Path.of("test"), Path.of("new-test"));
        Files.copy(Path.of("test/test.txt"), Path.of("new-test/new-test.txt"));
    }
}
