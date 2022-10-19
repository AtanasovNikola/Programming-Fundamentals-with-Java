package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String number = scanner.nextLine();
        int[] numbers = Arrays.stream(number.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.printf("%d",sum);
    }
}
