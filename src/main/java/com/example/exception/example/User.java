package com.example.exception.example;

import java.util.Objects;

public class User {

    private final String name;
    private UserData userData;

    public User(String name) {
        this.name = name;
    }

    public User(String name, UserData userData) {
        this.name = name;
        this.userData = userData;
    }

    public String getName() {
        return name;
    }

    public UserData getUserData() {
        return userData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name) && Objects.equals(userData, user.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userData);
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", userData=" + userData +
            '}';
    }
}
