package org.example;

import java.util.List;

public class CarService {
    CarRepository carRepository = new CarRepository();
    public void addCar(String carName, String carModel, String carColor, int carYear) {
       Car car = new Car(carName, carModel, carColor, carYear);
        carRepository.saveCar(car);
    }

    public Car getCar() {
        return null;
    }

    public List<Car> getAllCars() {
        return null;
    }

    public Car editCar() {
        return null;
    }

    public void deleteCar() {

    }
}
