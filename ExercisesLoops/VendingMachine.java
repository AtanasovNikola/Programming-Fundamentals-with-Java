package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String money = scanner.nextLine();
        double totalMoney = 0;
        double currentMoney = 0;

        while (!money.equals("Start")) {
            currentMoney = Double.parseDouble(money);
            if (currentMoney == 0.1 || currentMoney == 0.2 || currentMoney == 0.5 || currentMoney == 1 || currentMoney == 2) {
                totalMoney += currentMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentMoney);

            }
            money = scanner.nextLine();
        }
        String product = scanner.nextLine();

        while (!product.equals("End")) {


            if (product.equals("Nuts")) {
                totalMoney -= 2;
                if (totalMoney >= 0) {
                    System.out.println("Purchased Nuts");
                } else {
                    System.out.println("Sorry, not enough money");
                    totalMoney += 2;
                }
            } else if (product.equals("Water")) {
                totalMoney -= 0.7;
                if (totalMoney >= 0) {
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Sorry, not enough money");
                    totalMoney += 0.7;
                }
            } else if (product.equals("Crisps")) {
                totalMoney -= 1.5;
                if (totalMoney >= 0) {

                    System.out.println("Purchased Crisps");
                } else {
                    System.out.println("Sorry, not enough money");
                    totalMoney += 1.5;
                }
            } else if (product.equals("Soda")) {
                totalMoney -= 0.8;
                if (totalMoney >= 0) {

                    System.out.println("Purchased Soda");
                } else {
                    System.out.println("Sorry, not enough money");
                    totalMoney += 0.8;
                }
            } else if (product.equals("Coke")) {
                totalMoney -= 1;
                if (totalMoney >= 0) {
                    System.out.println("Purchased Coke");
                } else {
                    System.out.println("Sorry, not enough money");
                    totalMoney += 1;
                }
            } else {
                System.out.println("Invalid product");
            }


            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);

    }
}
