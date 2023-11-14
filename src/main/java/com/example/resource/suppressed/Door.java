package com.example.resource.suppressed;

import java.io.IOException;

public class Door implements AutoCloseable {

    @Override
    public void close() {
        throw new RuntimeException("Executing close(): The door is closing");
    }

    public void doSomething() throws IOException {
        throw new IOException("IOException");
    }
}
