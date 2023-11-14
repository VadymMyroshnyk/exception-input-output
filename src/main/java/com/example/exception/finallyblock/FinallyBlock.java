package com.example.exception.finallyblock;

import com.example.exception.objectmapper.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class FinallyBlock {

    public static void main(String[] args) {
        FinallyBlock finallyBlock = new FinallyBlock();
        finallyBlock.exampleOne();
        Map<String, Object> result = finallyBlock.exampleTwo("{\"key\":\"value\"}");

        System.out.println(result);
    }

    public Map<String, Object> exampleTwo(String string) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            System.out.println("try");

            return objectMapper.readValue(string, new TypeReference<>() {
            });
        } catch (JsonProcessingException ex) {
            System.out.println("catch");
            throw new JsonParseException("catch");
        } finally {
            System.out.println("finally");
        }
    }

    public void exampleOne() {
        FileReader reader = null;
        try {
            reader = new FileReader("/tmp/somefile");
            // do some processing
        } catch (FileNotFoundException ex) {
            // do something
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    // do something
                }
            }
        }
    }
}
