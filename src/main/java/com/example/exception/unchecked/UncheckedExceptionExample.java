package com.example.exception.unchecked;

public class UncheckedExceptionExample {

    public static void main(String[] args) {
        UncheckedExceptionExample ue = new UncheckedExceptionExample();
        ue.run();
    }

    public void run() {
        throwRuntimeException();
    }

    public void throwRuntimeException() {
        throw new NullPointerException("Null pointer");
    }
}
