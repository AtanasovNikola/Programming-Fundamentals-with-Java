package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Vehicle> allVehicles = new ArrayList<>();
        int carsCounter = 0;
        int trucksCounter = 0;
        int horsePowerCars = 0;
        int horsePowerTrucks = 0;

        while (!command.contains("End")) {
            String[] currentVehicle = command.split(" ");
            String type = currentVehicle[0];
            String model = currentVehicle[1];
            String color = currentVehicle[2];
            String horsePower = currentVehicle[3];
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            allVehicles.add(vehicle);
            if (command.split(" ")[0].equals("car")) {
                horsePowerCars += Integer.parseInt(horsePower);
                carsCounter++;
            } else {
                horsePowerTrucks += Integer.parseInt(horsePower);
                trucksCounter++;
            }

            command = scanner.nextLine();
        }
        String models = scanner.nextLine();
        while (!models.contains("Close the Catalogue")) {
            for (Vehicle vehicle : allVehicles) {
                if (models.equals(vehicle.getModel())) {
                    System.out.printf("Type: %s%n", vehicle.getType());
                    System.out.printf("Model: %s%n", vehicle.getModel());
                    System.out.printf("Color: %s%n", vehicle.getColor());
                    System.out.printf("Horsepower: %s%n", vehicle.getHorsePower());
                }
            }
            models = scanner.nextLine();
        }
            double averageHorsePowerCars = 0;
        if (horsePowerCars == 0 || carsCounter == 0) {
        } else {
            averageHorsePowerCars = horsePowerCars * 1.0 / carsCounter;
        }
        double averageHorsePowerTrucks = 0;
        if (trucksCounter == 0 || horsePowerTrucks == 0) {

        } else {
            averageHorsePowerTrucks = 1.0 * horsePowerTrucks / trucksCounter;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsePowerTrucks);
    }
}
