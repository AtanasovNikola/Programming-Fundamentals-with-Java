package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int currentNumber = 0;



        for (int i = 1; i <= n; i++) {
        int sum=0;

            currentNumber = i;

            while (currentNumber > 0) {
            sum += currentNumber % 10;
            currentNumber = currentNumber / 10;
            }


        if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i );
            }else{
            System.out.printf("%d -> False%n", i);
        }
        }
    }
}
