package com.example.resource.autocloseable;

public class Alarm implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Executing close(): The alarm is armed");
    }
}
