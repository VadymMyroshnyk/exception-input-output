package com.example.resource.autocloseable;

import java.io.IOException;

public class Door implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Executing close(): The door is closing");
    }

    public void doSomething() throws IOException {
        throw new IOException("IOException");
    }
}
