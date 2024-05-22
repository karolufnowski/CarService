package org.example;

import java.util.List;
import java.util.Scanner;

public class CarService {
    public static Car addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter brand:");
        String carName = scanner.nextLine();
        System.out.println("Enter model:");
        String carModel = scanner.nextLine();
        System.out.println("Enter color");
        String carColor = scanner.nextLine();
        System.out.println("Enter year of production:");
        int carYear = scanner.nextInt();
        return new Car(carName, carModel, carColor, carYear);
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
