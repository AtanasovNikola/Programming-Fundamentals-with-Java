package MidExam;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] allVehiclesArray = scanner.nextLine().split(">>");
        double taxes = 0;
        for (int numOfVehicles = 1; numOfVehicles <= allVehiclesArray.length; numOfVehicles++) {
            String[] currentVehicleArray = allVehiclesArray[numOfVehicles - 1].split(" ");
            if ("family".equals(currentVehicleArray[0])) {
                int taxIncrease = Integer.parseInt(currentVehicleArray[2]) / 3000;
                double allTaxes = taxIncrease * 12 + (50 - Integer.parseInt(currentVehicleArray[1]) * 5);
                taxes += allTaxes;
                print(currentVehicleArray[0], allTaxes);
            } else if ("heavyDuty".equals(currentVehicleArray[0])) {
                int taxIncrease = Integer.parseInt(currentVehicleArray[2]) / 9000;
                double allTaxes = taxIncrease * 14 + (80 - Integer.parseInt(currentVehicleArray[1]) * 8);
                taxes += allTaxes;
                print(currentVehicleArray[0], allTaxes);
            } else if ("sports".equals(currentVehicleArray[0])) {
                int taxIncrease = Integer.parseInt(currentVehicleArray[2]) / 2000;
                double allTaxes = taxIncrease * 18 + (100 - Integer.parseInt(currentVehicleArray[1]) * 9);
                taxes += allTaxes;
                print(currentVehicleArray[0], allTaxes);
            } else {
                System.out.println("Invalid car type.");
            }

        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", taxes);

    }

    public static void print(String type, double taxes) {
        System.out.printf("A %s car will pay %.2f euros in taxes.%n", type, taxes);
    }
}
