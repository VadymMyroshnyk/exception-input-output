package com.example.resource.finallyexample;

import java.io.IOException;

public class FinallyExample {

    public static void main(String[] args) {
        new FinallyExample().open();
    }

    public void open() {
        Door door = new Door();
        try {
//            door.doSomething();
        } finally {
            if (door != null) {
                door.close();
            }
        }
    }
}
