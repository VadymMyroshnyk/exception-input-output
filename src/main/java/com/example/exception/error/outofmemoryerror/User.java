package com.example.exception.error.outofmemoryerror;

import java.util.Arrays;

public class User {

    private final byte[] avatar;

    public User(byte[] avatar) {
        this.avatar = avatar;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Arrays.equals(avatar, user.avatar);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(avatar);
    }

    @Override
    public String toString() {
        return "User{" +
            "avatar=" + Arrays.toString(avatar) +
            '}';
    }
}
