package com.jetbrains.java16.records;


import org.jetbrains.annotations.NotNull;

public record Parcel<T>(@NotNull T contents, double weight) {
    public static void main(String[] args) {
        Parcel<Table> parcel = new Parcel<>(new Table(), 12.76);
    }
}

class Table {

}
