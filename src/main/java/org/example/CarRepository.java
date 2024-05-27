package org.example;

import java.util.HashMap;
import java.util.Map;

public class CarRepository {
    private final Map<Integer, Car> cars = new HashMap<>();
    int counter = 0;

    public void saveCar(Car car) {
        cars.put(counter, car);
        counter++;
    }

    public Car getCar(int carID) {
        return cars.get(carID);
    }

    public Map<Integer, Car> getCars() {
        return cars;
    }

    public void updateCar() {

    }

    public void deleteCar() {
        
    }
}
