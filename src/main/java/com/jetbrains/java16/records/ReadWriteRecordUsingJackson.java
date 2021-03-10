package com.jetbrains.java16.records;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class ReadWriteRecordUsingJackson {

    public static void main(String[] args) {
        // 1. Persist record Rectangle using Jackson 2.11.3
        Rectangle rectangle = new Rectangle(20, 60);
        writeToFileUsingJackson(rectangle);
        System.out.println(readFromFileUsingJackson());
    }

    static void writeToFileUsingJackson(Object obj) {
        try {
            new ObjectMapper()
                    .writeValue(new FileOutputStream(getFile()),
                                obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Object readFromFileUsingJackson() {
        Object retValue = null;
        try {
            retValue = new ObjectMapper()
                    .readValue(new FileInputStream(getFile()),
                               Rectangle.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retValue;
    }

    private static File getFile() {
        // Smelly code - hardcoded file value
        // to do - to change file location
        return new File("myjsondata.json");
    }

}
