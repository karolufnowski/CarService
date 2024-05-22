package org.example;

import java.util.HashMap;
import java.util.Map;

public class CarRepository extends CarService {
    private final Map<Integer, Car> cars = new HashMap<>();
    int counter = 0;

    public void saveCar(Car car) {
        cars.put(counter, car);
        counter++;
    }

    public Car getCar() {
        return null;
    }

    public Map<Integer, Car> getCars() {
        return null;
    }

    public void updateCar() {

    }

    public void deleteCar() {
        
    }
}
