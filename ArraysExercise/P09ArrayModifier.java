package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = array[index1];
                int element2 = array[index2];
                array[index1] = element2;
                array[index2] = element1;
            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = array[index1];
                int element2 = array[index2];
                int total = element1 * element2;
                array[index1] = total;
            } else if (command.contains("decrease")) {
                for (int index = 0; index < array.length; index++) {
                    array[index] -= 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int index = 0; index < array.length ; index++) {
            if (index== array.length-1) {
                System.out.print(array[index]);
            }else{
                System.out.print(array[index] + ", ");
            }
        }
        }
    }

