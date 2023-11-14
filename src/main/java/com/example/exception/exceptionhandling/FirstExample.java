package com.example.exception.exceptionhandling;

public class FirstExample {

    public static void main(String[] args) {
        callMethod();
        System.out.println("callMethod Done");
    }

    private static void callMethod() {
        String str = null;
        int len = str.length();
        System.out.println("String Length Done");
    }
}
