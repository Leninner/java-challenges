package POOChallenge;

import java.util.Scanner;

public class Main {
    public static int getCheapestVehicleIndex(Vehicle[] vehicles){
        int cheapestVehicleIndex = 0;

        for (int i = 1; i < vehicles.length; i++) {
            if (vehicles[i].getVehiclePrice() < vehicles[cheapestVehicleIndex].getVehiclePrice()) {
                cheapestVehicleIndex = i;
            }
        }

        return cheapestVehicleIndex;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vehicleBrand;
        String vehicleModel;
        double vehiclePrice;

        System.out.println("Digita la cantidad de vehiculos que deseas agregar: ");
        System.out.print("-> ");
        int vehiclesQuantity = scan.nextInt();

        Vehicle[] vehicles = new Vehicle[vehiclesQuantity];

        System.out.println("Ingresa los datos de los vehiculos: ");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nDigita la marca del vehiculo: ");
            System.out.print("-> ");
            vehicleBrand = scan.next();

            System.out.println("\nDigita el modelo del vehiculo: ");
            System.out.print("-> ");
            vehicleModel = scan.next();

            System.out.println("\nDigita el precio del vehiculo: ");
            System.out.print("-> ");
            vehiclePrice = scan.nextDouble();

            vehicles[i] = new Vehicle(vehicleBrand, vehicleModel, vehiclePrice);
        }

        System.out.println("\nEl coche mas barato es: ");
        System.out.println(vehicles[getCheapestVehicleIndex(vehicles)].showVehicleInfo());
    }
}
