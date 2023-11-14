package com.example.exception.checked.exception;

import java.io.IOException;

public class UserException extends IOException {

    public UserException(String message) {
        super(message);
    }
}
