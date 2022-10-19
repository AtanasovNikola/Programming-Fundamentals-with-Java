package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String password = scanner.nextLine();
        if (passwordLength(password) && consistLetterAndDigits(password) && consistTwoDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!passwordLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistLetterAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!consistTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passwordLength(String pass) {
        boolean isCorrect = true;
        if (pass.length() < 6 || pass.length() > 10) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public static boolean consistLetterAndDigits(String pass) {
        boolean consistOnlyLettersAndDigits = true;
        for (int index = 0; index < pass.length(); index++) {
            if (pass.charAt(index) < 48 || (pass.charAt(index) > 57 && pass.charAt(index) < 65) ||
                    (pass.charAt(index) > 90 && pass.charAt(index) < 97) || pass.charAt(index) > 122) {
                consistOnlyLettersAndDigits = false;
                break;
            }
        }
        return consistOnlyLettersAndDigits;
    }

    public static boolean consistTwoDigits(String pass) {
        boolean consinstTwoDigits = false;
        int counter = 0;
        for (int index = 0; index < pass.length(); index++) {
            if (pass.charAt(index) > 47 && pass.charAt(index) < 58) {
                counter++;
            }
            if (counter == 2) {
                consinstTwoDigits = true;
                break;
            }
        }
        return consinstTwoDigits;
    }
}
