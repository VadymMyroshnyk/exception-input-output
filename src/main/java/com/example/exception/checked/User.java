package com.example.exception.checked;

import com.example.exception.checked.exception.UserException;

public class User {

    public String getName(String name) throws UserException {
        throw new UserException("test");
    }
}
