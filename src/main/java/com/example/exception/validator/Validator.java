package com.example.exception.validator;

import static java.util.Objects.isNull;

public class Validator {

    private static final int MIN_SIZE = 4;
    private static final int MAX_DESCRIPTION_SIZE = 255;

    public static void main(String[] args) {
        Validator validator = new Validator();

        validator.validateString("w");

        //do some processing
    }

    public void validateString(String string) {
        if (isNull(string)) {
            throw new ValidationStringException("String is null");
        }

        // after isNull
        if (string.isBlank()) {
            throw new ValidationStringException("String is blank");
        }

        if (string.length() < MIN_SIZE) {
            throw new ValidationStringException("String is less than min size");
        }

        if (string.length() > MAX_DESCRIPTION_SIZE) {
            throw new ValidationStringException("String is more than max size ");
        }
    }
}
