package com.example.exception.checked;

import java.io.FileNotFoundException;

public class CheckedExceptionExample {

    public static void main(String[] args) throws FileNotFoundException {
        CheckedExceptionExample checkedExceptionExample = new CheckedExceptionExample();
        checkedExceptionExample.run();
    }

    public void run() throws FileNotFoundException {
        throwException();
    }

    public void throwException() throws FileNotFoundException {
        System.out.println("");
        throw new FileNotFoundException("File not found");
    }
}
