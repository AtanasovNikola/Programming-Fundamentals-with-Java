package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P05EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

int sumEven=0;
int sumOdd=0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.printf("%d",sumEven-sumOdd);
    }

}
