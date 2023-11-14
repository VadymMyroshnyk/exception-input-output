package com.example.resource.suppressed;

import com.example.resource.autocloseable.AutoCloseableExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SuppressedExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(SuppressedExample.class);

    public static void main(String[] args) {
        try (Door door = new Door()){
            door.doSomething();
            door.doSomething();
            door.doSomething();
            door.doSomething();
        } catch (IOException e) {
            LOGGER.info("finish");
        }
    }
}
