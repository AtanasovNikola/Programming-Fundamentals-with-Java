package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        if (typeOfGroup.equals("Students")) {
            switch (day) {
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
        } else if (typeOfGroup.equals("Business")) {
            switch (day) {
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16.00;
                    break;
            }
        } else if (typeOfGroup.equals("Regular")) {
            switch (day) {
                case "Friday":
                    price = 15.00;
                    break;
                case "Saturday":
                    price = 20.00;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
        }
        double totalPrice = (numberOfGroup * price);
        if (numberOfGroup >= 30 && typeOfGroup.equals("Students")) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if (typeOfGroup.equals("Business") && numberOfGroup >= 100) {
            totalPrice = totalPrice - (10 * price);
        }
        if (typeOfGroup.equals("Regular") && numberOfGroup >= 10 && numberOfGroup <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
