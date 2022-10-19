package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());

        while (number % 2 != 0) {
            System.out.printf("Please write an even number.%n");
            number= Integer.parseInt(scanner.nextLine());
        }

            System.out.printf("The number is: %d",Math.abs(number));

    }
}

