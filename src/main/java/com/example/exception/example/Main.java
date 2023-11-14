package com.example.exception.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        System.out.println(args[0]);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }


//        Thread.sleep(2000);

//        new Main().someMethod();
        new Main().someMethodTwo();
    }

//    private void someMethod() {
//        Object o = null;
//        o.toString();
//    }

    private void someMethodTwo() {
        getUsers().forEach(user -> {
            UserData userData = user.getUserData();
//
            if (userData != null) {
                System.out.println(userData.getAge());
            }
        });
    }

    private List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("first", new UserData(25)));
        users.add(new User("second", null));
        users.add(new User("third", new UserData(10)));

        return users;
    }
}
