package com.jetbrains.java16.patternmatching;

public class Monitor {
    String model;
    double price;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Monitor) {
            Monitor other = (Monitor) o;
            if (model.equals(other.model) && price == other.price) {
                return true;
            }
        }
        return false;
    }

    /*
    After refactoring

    @Override
    public boolean equals(Object o) {
        return o instanceof Monitor other
                && model.equals(other.model)
                && price == other.price;
    }
    */
}