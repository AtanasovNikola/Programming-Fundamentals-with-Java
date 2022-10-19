package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <=secondNumber ; i++) {
            char symbol= (char) i;
            System.out.printf("%c ",symbol);
        }
    }
}
