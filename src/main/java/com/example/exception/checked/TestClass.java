package com.example.exception.checked;

import com.example.exception.checked.exception.UserException;

public class TestClass {

    public static void main(String[] args) {
        User user = new User();

        try {
            user.getName("nn");
        } catch (UserException e) {
           throw new RuntimeException();
        }

        System.out.println();
    }
}
