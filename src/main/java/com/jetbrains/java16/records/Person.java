package com.jetbrains.java16.records;

public record Person(int age, String name) {
    public Person(int age, String name) {
        if (age < 0) {
            throw new IllegalArgumentException("age < 0");
        }
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person student = new Person(17, "Shreya");
    }
}
