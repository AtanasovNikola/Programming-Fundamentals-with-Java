package Practice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        boolean isNum1Right = false;
        boolean isNum2Right = false;
        boolean isNum3Right = false;
        for (int i = 1; i <= num1; i++) {
            if (i % 2 == 0) {
                isNum1Right = true;

                for (int j = 2; j <= num2; j++) {
                    if (j >= 2 && j <= 7) {
                        if (j == 2 || j == 3 || j == 5 || j == 7) {
                            isNum2Right = true;

                            for (int k = 1; k <= num3; k++) {
                                if (k % 2 == 0) {
                                    isNum3Right = true;


                                        System.out.printf("%d %d %d%n", i, j, k);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
