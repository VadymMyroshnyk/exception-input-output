package com.example.file.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        readSingleCharacter();
        readAllCharacters();
    }

    private static void readSingleCharacter() {
        try (FileInputStream fin = new FileInputStream("testout.txt")) {
            int i = fin.read();

            System.out.println((char) i);
        } catch (IOException e) {
            throw new FileException(e);
        }
    }

    private static void readAllCharacters() {
        try (FileInputStream fin = new FileInputStream("testout.txt")) {
            int charValue;

            while ((charValue = fin.read()) != -1) {
                System.out.print((char) charValue);
            }

        } catch (IOException e) {
            throw new FileException(e);
        }
    }
}
