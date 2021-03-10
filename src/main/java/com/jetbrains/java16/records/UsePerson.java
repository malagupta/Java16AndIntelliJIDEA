package com.jetbrains.java16.records;

public class UsePerson {
    public static void main(String[] args) {
        // Person person = new Person("Java", 25);
        ReadWriteObj.writeToFile("ss", "hello");
        ReadWriteObj.readFromFile("hello");
    }
}
