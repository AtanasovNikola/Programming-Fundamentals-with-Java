package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P09PalindromeIntegers {
    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String inPut = scanner.nextLine();

        while (!inPut.equals("END")) {
        boolean isPalindrome = false;
            int lastDigit = 0;
            int numbers = Integer.parseInt(inPut);

            if (inPut.charAt(0) == inPut.charAt(inPut.length() - 1)) {
                isPalindrome = true;
            }
            if (isPalindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            inPut = scanner.nextLine();
        }
    }
}
