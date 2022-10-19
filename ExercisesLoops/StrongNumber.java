package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentFac=0;
        int currentNumber=number;

        while (number > 0) {
            int lastNumber = number % 10;
            int fac = 1;
            for (int i = 1; i <= lastNumber; i++) {
                fac = fac * i;
            }
currentFac+=fac;
            number = number / 10;
        }
        if (currentFac==currentNumber){
            System.out.printf("yes");
        }else{
            System.out.printf("no");
        }
    }
}
