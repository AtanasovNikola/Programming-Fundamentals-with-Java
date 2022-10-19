package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            if (commandArr[0].contains("swap")) {
                swap(array, commandArr, commandArr[1], commandArr[2]);
            } else if (commandArr[0].contains("multiply")) {
                multiply(array, commandArr, commandArr[1], commandArr[2]);

            } else if (commandArr[0].contains("decrease")) {
                decrease(array);
            }
            command = scanner.nextLine();
        }
        for (int index = 0; index < array.length ; index++) {
            if (index== array.length-1){
                System.out.print(array[index]);
                break;
            }
            System.out.print(array[index] + "," + " ");
        }
    }

    public static void swap(int[] arrayNums, String[] array, String index1, String index2) {
        int firstIndex = Integer.parseInt(index1);
        int secondIndex = Integer.parseInt(index2);
        int smallestNumber = Math.min(firstIndex,secondIndex);
        int biggestNumber = Math.max(firstIndex,secondIndex);
        int firstNumber = arrayNums[smallestNumber];
        for (int i = smallestNumber; i <= biggestNumber; i++) {
            if (i == smallestNumber) {

                arrayNums[i] = arrayNums[biggestNumber];
            }
            if (i == biggestNumber) {
                arrayNums[i] = firstNumber;
            }
        }
    }

    public static void multiply(int[] arrayNums, String[] array, String index1, String index2) {
        int firstIndex = Integer.parseInt(index1);
        int secondIndex = Integer.parseInt(index2);
        int firstNumber = arrayNums[firstIndex];
        int secondNumber = arrayNums[secondIndex];
        arrayNums[firstIndex] *= arrayNums[secondIndex];
    }

    public static void decrease(int[] arrayNums) {

        for (int index = 0; index < arrayNums.length; index++) {
            arrayNums[index] -= 1;
        }
    }
}
