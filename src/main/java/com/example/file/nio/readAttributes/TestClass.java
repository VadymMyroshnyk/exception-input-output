package com.example.file.nio.readAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class TestClass {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("sea.txt");
        BasicFileAttributes data = Files.readAttributes(path,
            BasicFileAttributes.class);
        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());
    }
}
