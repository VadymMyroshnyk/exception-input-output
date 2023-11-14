package com.example.file.nio.FilesReadAllLinesVsFileslines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("birds.txt");

        List<String> strings = Files.readAllLines(path);

        try (Stream<String> lines = Files.lines(path)) {
            List<String> allStrings = lines
                .filter(s -> s.length() > 2)
                .toList();
        }

        // DOES NOT COMPILE
        Files.readAllLines(path)
//            .filter(s -> s.length()> 2)
            .forEach(System.out::println);
    }
}
