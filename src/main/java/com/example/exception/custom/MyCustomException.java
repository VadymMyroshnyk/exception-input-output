package com.example.exception.custom;

public class MyCustomException {

    public static void main(String[] args) throws CustomException {
        throw new CustomException("custom exception");
    }
}
