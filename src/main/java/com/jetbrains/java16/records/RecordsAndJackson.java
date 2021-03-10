package com.jetbrains.java16.records;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RecordsAndJackson {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = """
                         {
                            "brand" : "Mercedes",
                            "doors" : 5
                         }""";
        Car car = objectMapper.readValue(carJson, Car.class);
        System.out.println("car brand = " + car.brand());
        System.out.println("car doors = " + car.doors());
    }
}
