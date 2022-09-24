package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        int orders = 1;
        double total = 0;

        while (countOfOrders >= orders) {
        double pricePerCapsule = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int capsuleCount = Integer.parseInt(scanner.nextLine());
            double totalPricePerOrder = pricePerCapsule * days * capsuleCount;
            System.out.printf("The price for the coffee is: $%.2f%n", totalPricePerOrder);
            total += totalPricePerOrder;
            orders++;


        }
        System.out.printf("Total: $%.2f", total);
    }
}
