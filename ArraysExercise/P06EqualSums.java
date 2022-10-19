package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;
        for (int index = 0; index < array.length; index++) {
            int currentElement= array[index];
        int sumLeft = 0;
        int sumRight = 0;
            for (int leftIndex = 0; leftIndex <index ; leftIndex++) {
                sumLeft +=array[leftIndex];
            }
            for (int rightIndex = index+1; rightIndex < array.length ; rightIndex++) {
                sumRight+=array[rightIndex];
            }
            if (sumLeft==sumRight){
                isFound=true;
                System.out.println(index);
                break;
            }

        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
