package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String username = scanner.nextLine();
        String password = "";
        int tries = 0;

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentNumber = username.charAt(position);
            password += currentNumber;

        }
        String guessPassword = scanner.nextLine();
        do {
            if (tries >= 3) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            if (password.equals(guessPassword)) {
                System.out.printf("User %s logged in.", username);
            } else {
                System.out.printf("Incorrect password. Try again.%n");
                tries++;
            }

            guessPassword = scanner.nextLine();
        } while (!password.equals(guessPassword));

            System.out.printf("User %s logged in.", username);

    }
}