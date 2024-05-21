package org.example;

public class Car {


    private final String brand;
    private final String model;
    private final String color;
    private final int year;

    Car(String brand, String model, String color, int year) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
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
