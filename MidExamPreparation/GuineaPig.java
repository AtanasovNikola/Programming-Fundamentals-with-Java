package MidExamPreparation;

import java.util.Scanner;

import static java.lang.System.in;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double food = Double.parseDouble(scanner.nextLine()); // food in kg;
        double hay = Double.parseDouble(scanner.nextLine()); // hay in kg;
        double cover = Double.parseDouble(scanner.nextLine()); // cover in kg;
        double pigKg = Double.parseDouble(scanner.nextLine()); // weight in kg;
        double foodInGrams = food * 1000;
        double hayInGrams = hay * 1000;
        double coverInGrams = cover * 1000;
        double weightInGrams = pigKg * 1000;
        for (int days = 1; days <= 30; days++) {
            foodInGrams -= 300;
            if (days % 2 == 0) {
                hayInGrams -= foodInGrams * 0.05;
            }
            if (days % 3 == 0) {
                coverInGrams -= weightInGrams / 3;
            }
            if (foodInGrams < 0 || hayInGrams < 0 || coverInGrams < 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGrams/1000, hayInGrams/1000, coverInGrams/1000);


    }
}
