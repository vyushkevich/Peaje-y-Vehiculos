package pyv.controller;

import pyv.model.*;

import java.util.Scanner;

public class TollController {
    private TollStation tollStation;
    private Scanner scanner;

    public TollController() {
        this.tollStation = new TollStation("Estación Central", "Ciudad Central");
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bienvenido al sistema de peaje");
        int option;

        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            handleOption(option);
        } while (option != 4);

        System.out.println("¡Gracias por usar el sistema de peaje!");
    }

    private void printMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Registrar coche");
        System.out.println("2. Registrar moto");
        System.out.println("3. Registrar camión");
        System.out.println("4. Mostrar resultados y salir");
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
                System.out.println("Opción inválida. Intente de nuevo.");
        }
    }

    private void registerCar() {
        System.out.println("Ingrese la placa del coche:");
        String licensePlate = scanner.nextLine();
        Vehicle car = new Car(licensePlate);
        tollStation.registerVehicle(car);
        System.out.println("Coche registrado con éxito.");
    }

    private void registerMotorcycle() {
        System.out.println("Ingrese la placa de la moto:");
        String licensePlate = scanner.nextLine();
        Vehicle motorcycle = new Motorcycle(licensePlate);
        tollStation.registerVehicle(motorcycle);
        System.out.println("Moto registrada con éxito.");
    }

    private void registerTruck() {
        System.out.println("Ingrese la placa del camión:");
        String licensePlate = scanner.nextLine();
        System.out.println("Ingrese el número de ejes:");
        int numberOfAxles = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        Vehicle truck = new Truck(licensePlate, numberOfAxles);
        tollStation.registerVehicle(truck);
        System.out.println("Camión registrado con éxito.");
    }

    private void showResults() {
        System.out.println("\nVehículos registrados:");
        for (Vehicle vehicle : tollStation.getVehicles()) {
            System.out.println("- " + vehicle.getClass().getSimpleName() + " con placa: " + vehicle.getLicensePlate());
        }
        System.out.println("Total recaudado: $" + tollStation.getTotalToll());
    }
}
