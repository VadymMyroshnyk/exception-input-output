package com.example.exception.error.outofmemoryerror;

import java.util.ArrayList;
import java.util.List;

public class JavaEatMemory {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        int index = 1;
        while (true) {
            // 1MB each loop
            byte[] avatar = new byte[1048576];

            User user = new User(avatar);
            users.add(user);

            Runtime runtime = Runtime.getRuntime();

            System.out.printf("[%d] free memory: %s%n", index++, runtime.freeMemory());
        }
    }
}
