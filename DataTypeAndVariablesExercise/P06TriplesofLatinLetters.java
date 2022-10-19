package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P06TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        char symbol1=96;
        char symbol2=96;
        char symbol3=96;

        for (int i = 0; i <= n-1; i++) {
            symbol1++;
            symbol2=96;
            for (int j = 0; j <= n-1; j++) {
                symbol2++;
                symbol3=96;
                for (int k = 0; k <= n-1; k++) {
                    symbol3++;
                    System.out.printf("%c%c%c%n",symbol1,symbol2,symbol3);
                }
            }
        }
    }
}
