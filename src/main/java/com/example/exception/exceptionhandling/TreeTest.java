package com.example.exception.exceptionhandling;

public class TreeTest {

    public static void main(String[] args) {
        String name = "name";
        callOne(name);
    }

    public static void callOne(String name) {
        callTwo(name);
    }

    public static void callTwo(String name) {
        callThree(null);
    }

    public static void callThree(String name) {
        System.out.println(String.format("This name is %d characters long", name.length()));
    }
}
