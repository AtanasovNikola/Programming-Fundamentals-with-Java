package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] array = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int maxNumber = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            maxNumber = array[index];
            for (int compareIndex = array.length - 1; compareIndex > index; compareIndex--) {
                if (maxNumber < array[compareIndex]) {
                    maxNumber = array[compareIndex];
                }
                if (array[index] == array[compareIndex]) {
                    array[index] = -111111111;
                }
            }

            if (maxNumber == array[index]) {
                System.out.print(array[index] + " ");

            }
        }
    }
}


