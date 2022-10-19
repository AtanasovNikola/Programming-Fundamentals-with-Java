package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num4; i++) {
            for (int j = num1; j <= num4; j++) {
                for (int k = num1; k <= num4; k++) {
                    for (int l = num1; l <= num4; l++) {
                        if (i % 2 == 0 && l % 2 != 0 && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);

                        } else if (i % 2 != 0 && l % 2 == 0 && i > l && (j + k) % 2 == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
