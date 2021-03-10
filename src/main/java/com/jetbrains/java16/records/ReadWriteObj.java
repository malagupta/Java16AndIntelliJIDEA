package com.jetbrains.java16.records;

import java.io.*;
public class ReadWriteObj {

    public static void main(String[] args) throws Exception {
        Person person = new Person(25, "Java");
        writeToFile(person, "../temp.txt");
        System.out.println(readFromFile("../temp.txt"));
    }

    static void writeToFile(Object obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static Object readFromFile(String path) {
        Object result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
            result = ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
