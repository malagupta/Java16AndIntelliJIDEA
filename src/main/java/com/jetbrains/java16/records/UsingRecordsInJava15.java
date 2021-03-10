package com.jetbrains.java16.records;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UsingRecordsInJava15 {
    public void createLocalInterface() {
        interface LocalInterface { }
    }

    public void createLocalEnum() {
        enum Color {RED, YELLOW, BLUE}
    }

    List<String> getTopPerformingStocks(List<Stock> allStocks, LocalDateTime dateTime) {
        record TopStock(Stock stock, double value) {
        }

        return allStocks.stream()
                        .map(s -> new TopStock(s, getStockValue(s, dateTime)))
                        .sorted((s1, s2) -> Double.compare(s1.value(), s2.value()))
                        .limit(2)
                        .map(s -> s.stock.getName())
                        .collect(Collectors.toList());
    }

    public double getStockValue(Stock stock, LocalDateTime dateTime) {
        int a = 100;
        return 100.00;
    }

    private Set<Pen> filterForPenWithFiveOrders(List<Pen> pens) {
        // Local Records
        record PenAndOrders(Pen pen, List<Pen> orders) { }
        return null;
    }

    private List<Pen> getOrdersFor(Pen pen) {
        return List.of(new Pen(), new Pen());
    }
}

class Stock{
    public String getName() {
        return name;
    }

    String name;
    double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

class Pen {
    String name;
    double length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
