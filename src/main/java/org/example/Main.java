package org.example;

// Stwórz serwis ktory bd umozliwial przyjmowanie, zapisywanie, wyswietlanie, edytowanie i usuwanie samochodow
// CZytanie danych z konsoli albo JSON
// Potrzebujemy serwis z repozytorium w ktorym bedziemy przechowywac samochody
// Niech kazdy samochod ma ID, marke, model, kolor, rok produkcji

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarService carService = new CarService();


        while (true) {
            showWelcomeMenu();
            int userChoice = scanner.nextInt();
            if (userChoice == 0) {
                break;
            } else if (userChoice == 1) {
                System.out.println("Enter brand:");
                String carName = scanner.nextLine();
                System.out.println("Enter model:");
                String carModel = scanner.nextLine();
                System.out.println("Enter color:");
                String carColor = scanner.nextLine();
                System.out.println("Enter year of production:");
                int carYear = scanner.nextInt();
                carService.addCar(carName, carModel, carColor, carYear);

            } else if (userChoice == 2) {
                System.out.println("Enter car ID:");
                int carID = scanner.nextInt();
                System.out.println(carService.getCar(carID));

            } else if (userChoice == 3) {
                carService.getAllCars().forEach(System.out::println);

            } else if (userChoice == 4) {
                System.out.println("Enter car ID:");
                int carID = scanner.nextInt();
                System.out.println("Enter brand:");
                String carName = scanner.nextLine();
                System.out.println("Enter model:");
                String carModel = scanner.nextLine();
                System.out.println("Enter color:");
                String carColor = scanner.nextLine();
                System.out.println("Enter year of production:");
                int carYear = scanner.nextInt();
                carService.editCar(carID, carColor, carName, carModel, carYear);
            }
        }
    }

    private static void showWelcomeMenu() {
        System.out.println("Welcome to the Car Service! How can we help you today?");
        System.out.println("1: Add a car");
        System.out.println("2: Show a car");
        System.out.println("3: Show all cars");
        System.out.println("4: Edit a car");
        System.out.println("5: Delete a car");
        System.out.println("0: Exit");
    }
}