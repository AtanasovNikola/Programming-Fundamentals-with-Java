package ObjectsandClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        BigInteger number1 = new BigInteger(scanner.nextLine());
        BigInteger number2 = new BigInteger(scanner.nextLine());
        BigInteger result = number1.add(number2);
        System.out.println(result);
    }
}
