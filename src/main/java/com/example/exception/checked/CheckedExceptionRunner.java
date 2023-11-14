package com.example.exception.checked;

// This program will not compile!
public class CheckedExceptionRunner {

    // Handle it using try - catch block
    // Or declare throws in its signature
    public static void main(String[] args) {
//        Thread.sleep(2000);
//        sleep();
        sleep(2000);
    }

    private static String get () {

        return "";
    }

    public static void sleep() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
