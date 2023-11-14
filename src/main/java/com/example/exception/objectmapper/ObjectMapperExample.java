package com.example.exception.objectmapper;

import com.example.exception.example.User;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

public class ObjectMapperExample {

    public static void main(String[] args) throws JsonProcessingException {
        Converter converter = new Converter();

        User user = converter.convertStringToUserWithException("{\"name\":\"valueOne\"}");
        Map<String, Object> stringObjectMap = converter.convertStringToMap("{\"key\":\"valueTwo\"}");
        User secondUser = converter.convertStringToUser("{\"name\":\"valueTree\"}");

        if (stringObjectMap.isEmpty()) {
            System.out.println("It is Ok");
        }

        System.out.println(stringObjectMap);
        System.out.println(user);
        System.out.println(secondUser);
    }
}
