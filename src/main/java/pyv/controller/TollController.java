package pyv.controller;

import pyv.model.*;

import java.util.Scanner;

public class TollController {
    private TollStation tollStation;
    private Scanner scanner;

    public TollController() {
        this.tollStation = new TollStation("Central Station", "Central City");
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the toll system");
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleOption(option);
        } while (option != 4);

        System.out.println("Thank you for using the toll system!");
    }

    private void printMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Register car");
        System.out.println("2. Register motorcycle");
        System.out.println("3. Register truck");
        System.out.println("4. Show results and exit");
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                registerCar();
                break;
            case 2:
                registerMotorcycle();
                break;
            case 3:
                registerTruck();
                break;
            case 4:
                showResults();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void registerCar() {
        System.out.println("Enter the car's license plate:");
        String licensePlate = scanner.nextLine();
        Vehicle car = new Car(licensePlate);
        tollStation.registerVehicle(car);
        System.out.println("Car successfully registered.");
    }

    private void registerMotorcycle() {
        System.out.println("Enter the motorcycle's license plate:");
        String licensePlate = scanner.nextLine();
        Vehicle motorcycle = new Motorcycle(licensePlate);
        tollStation.registerVehicle(motorcycle);
        System.out.println("Motorcycle successfully registered.");
    }

    private void registerTruck() {
        System.out.println("Enter the truck's license plate:");
        String licensePlate = scanner.nextLine();
        System.out.println("Enter the number of axles:");
        int numberOfAxles = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        Vehicle truck = new Truck(licensePlate, numberOfAxles);
        tollStation.registerVehicle(truck);
        System.out.println("Truck successfully registered.");
    }

    private void showResults() {
        System.out.println("\nRegistered vehicles:");
        for (Vehicle vehicle : tollStation.getVehicles()) {
            System.out.println("- " + vehicle.getClass().getSimpleName() + " with license plate: " + vehicle.getLicensePlate());
        }
        System.out.println("Total toll collected: $" + tollStation.getTotalToll());
    }
}
