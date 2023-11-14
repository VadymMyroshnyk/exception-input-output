package com.example.exception.example;

import java.util.Objects;

public class UserData {

    private final int age;

    public UserData(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData userData)) return false;
        return age == userData.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "UserData{" +
            "age=" + age +
            '}';
    }
}
