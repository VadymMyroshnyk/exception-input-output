package com.example.file.nio.find;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("/bigcats");
        long minSize = 1_000;
        try (Stream<Path> stream = Files.find(path, 10,
            (p, a) -> a.isRegularFile()
                && p.toString().endsWith(".java")
                && a.size() > minSize)) {

            stream.forEach(System.out::println);
        }
    }
}
