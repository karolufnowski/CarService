package org.example;

public class Car {

    private final String id;
    private final String brand;
    private final String model;
    private final String color;
    private final int year;

    Car(String id, String brand, String model, String color, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
