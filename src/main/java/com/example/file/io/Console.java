package com.example.file.io;

import java.io.IOException;

public class Console {

    public static void main(String[] args) throws IOException {
        System.out.println("simple message");
        System.err.println("error message");

        int i = System.in.read();
        System.out.println((char) i);
    }
}
