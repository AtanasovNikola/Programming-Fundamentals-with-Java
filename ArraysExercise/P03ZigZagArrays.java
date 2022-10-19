package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {

            String[] array = scanner.nextLine().split(" ");

            if (row % 2 == 0) {
                firstArray[row - 1] = array[1];
                secondArray[row - 1] = array[0];
            } else {
                firstArray[row - 1] = array[0];
                secondArray[row - 1] = array[1];
            }


        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
