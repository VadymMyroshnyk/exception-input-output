package com.example.exception.objectmapper;

import com.example.exception.custom.CustomException;
import com.example.exception.example.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collections;
import java.util.Map;

public class Converter {

    private final ObjectMapper objectMapper;

    public Converter() {
        this.objectMapper = new ObjectMapper();
    }

    public User convertStringToUserWithException(String string) {
        try {
            return objectMapper.readValue(string, User.class);
        } catch (JsonProcessingException e) {
            String message = String.format("Error happened while converting string to user: %s", string);
            throw new CustomException(message);
        }
    }

    public Map<String, Object> convertStringToMap(String string) {
        try {
            return objectMapper.readValue(string, new TypeReference<>() {
            });
        } catch (JsonProcessingException e) {
            return Collections.emptyMap();
        }
    }

    public User convertStringToUser(String string) {
        try {
            return objectMapper.readValue(string, User.class);
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
