package com.example.file.io;

public class FileException extends RuntimeException {

    public FileException(Throwable cause) {
        super(cause);
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }
}
