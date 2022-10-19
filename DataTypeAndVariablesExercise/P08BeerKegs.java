package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        String winner = "";

        for (int i = 1; i <= numberOfKegs; i++) {
            String modelOfTheKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double result = Math.PI * Math.pow(radius, 2) * height;
            if (result > maxValue) {
                maxValue = result;
                winner = modelOfTheKeg;
            }
        }
        System.out.printf("%s",winner );
    }
}
