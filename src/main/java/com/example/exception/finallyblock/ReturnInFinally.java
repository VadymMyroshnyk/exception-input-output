package com.example.exception.finallyblock;

public class ReturnInFinally {

    public static void main(String[] args) {
        ReturnInFinally.example();

        System.out.println("Ended without error");
    }

    private static void example() {
        try {
            throw new NullPointerException();
        } finally {
            System.out.println("finally");
            return;
        }
    }
}
