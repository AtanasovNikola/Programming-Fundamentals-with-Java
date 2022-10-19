package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] array = scanner.nextLine().split(" ");


        int numOfRotations = Integer.parseInt(scanner.nextLine());
        for (int rotations = 0; rotations <numOfRotations ; rotations++) {

            String firstSymbol=array[0];
            for (int index = 0; index < array.length-1  ; index++) {
 array[index]=array[index+1];
            }

           array[array.length-1]= firstSymbol;

            }
        System.out.println(String.join(" ",array));
        }
    }

