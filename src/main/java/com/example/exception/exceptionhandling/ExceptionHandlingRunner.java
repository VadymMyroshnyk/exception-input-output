package com.example.exception.exceptionhandling;

public class ExceptionHandlingRunner {

    public static void main(String[] args) {

        try{
            System.out.println(args[0]);
        } catch (NullPointerException e) {

        }





        method1();
        System.out.println("main() Done");
    }

    private static void method1() {
        method2();
        System.out.println("method1() done");
    }

    private static void method2() {
        try {
            String str = null;
            int len = str.length();
            System.out.println("method2() Done");
        } catch (Exception ex) {
        }
    }
}
