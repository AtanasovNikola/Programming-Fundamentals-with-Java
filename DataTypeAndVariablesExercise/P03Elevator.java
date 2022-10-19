package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courseCount = 0;
        int currentNumberOfPeople=numberOfPeople;

        if (numberOfPeople > capacity) {
            while (currentNumberOfPeople >= capacity) {

                currentNumberOfPeople -= capacity;
                courseCount++;
            }
            if (currentNumberOfPeople>0) {
                courseCount++;
            }
            System.out.printf("%d",courseCount,capacity);
        } else {
            courseCount++;
        System.out.printf("%d",courseCount);
        }


    }
}
