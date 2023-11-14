package com.example.resource.autocloseable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AutoCloseableExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(AutoCloseableExample.class);

    public static void main(String[] args) {
        try (Alarm alarm = new Alarm();
             Door door = new Door()) {

//            door.doSomething();
        }


    }
}
