package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        matrix(n);
    }
    public static void matrix (int number){
        for (int rows = 1; rows <=number ; rows++) {
            for (int colons = 1; colons <=number ; colons++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
