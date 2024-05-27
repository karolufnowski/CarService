package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    CarRepository carRepository = new CarRepository();
    public void addCar(String carName, String carModel, String carColor, int carYear) {
       Car car = new Car(carName, carModel, carColor, carYear);
        carRepository.saveCar(car);
    }

    public Car getCar(int carID) {
        return carRepository.getCar(carID);
    }

    public List<Car> getAllCars() {
        return carRepository.getCars().values().stream().collect(Collectors.toList());
    }

    public Car editCar(int carID, String carName, String carModel, String carColor, int carYear) {
        return null;
    }

    public void deleteCar() {

    }
}
