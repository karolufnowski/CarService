package org.example;

// Stwórz serwis ktory bd umozliwial przyjmowanie, zapisywanie, wyswietlanie, edytowanie i usuwanie samochodow
// CZytanie danych z konsoli albo JSON
// Potrzebujemy serwis z repozytorium w ktorym bedziemy przechowywac samochody
// Niech kazdy samochod ma ID, marke, model, kolor, rok produkcji

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showWelcomeMenu();
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        CarService carService = new CarService();


        while (true) {
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