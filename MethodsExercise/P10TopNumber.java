package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        isTop(n);
    }

    public static void isTop(int number) {
        for (int i = 16; i <= number; i++) {
            boolean isTop = false;
            int currentNumber = i;
            int sumOfDigits = 0;
            while (currentNumber > 0) {
                sumOfDigits += currentNumber % 10;
                currentNumber /= 10;
            }
            int oddDigit = i;
            if (sumOfDigits % 8 == 0) {
                while (oddDigit > 0) {
                    if (oddDigit % 2 == 1) {
                        isTop = true;
                        break;
                    }
                    oddDigit /= 10;
                }
            }
            if (isTop) {
                System.out.println(i);
            }
        }
    }
}



