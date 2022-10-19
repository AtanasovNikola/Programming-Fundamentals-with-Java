package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int waterTank = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentWaterTank = waterTank;

        for (int i = 1; i <= n; i++) {
            int addedWater = Integer.parseInt(scanner.nextLine());
            currentWaterTank -= addedWater;
            if (currentWaterTank < 0) {
                currentWaterTank += addedWater;
                System.out.printf("Insufficient capacity!%n");
                continue;
            }
            sum+=addedWater;

        }
        System.out.printf("%d",sum);
    }
}
