package com.example.resource.finallyexample;

import java.io.Closeable;
import java.io.IOException;

public class Door implements Closeable {

    @Override
    public void close() {
        System.out.println("Executing close(): The door is closing");
    }

    public void doSomething() throws IOException {
        throw new IOException("IOException");
    }
}
