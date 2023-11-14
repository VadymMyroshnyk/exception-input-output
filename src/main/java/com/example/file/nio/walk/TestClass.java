package com.example.file.nio.walk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestClass {

    public static void main(String[] args) throws IOException {
        long pathSize = getPathSize(Path.of(""));

        System.out.println(pathSize);
    }

    public static long getPathSize(Path source) throws IOException {
        try (var stream = Files.walk(source)) {
            return stream.parallel()
                .filter(p -> !Files.isDirectory(p))
                .mapToLong(TestClass::getSize)
                .sum();
        }
    }

    private static long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            // Handle exception
        }
        return 0L;
    }
}
