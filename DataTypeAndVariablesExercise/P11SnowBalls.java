package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P11SnowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int snowballSnow=0;
        int snowballTime=0;
        int snowballQuality=0;
        double winner=Double.MIN_VALUE;
        for (int i = 1; i <= numberOfSnowballs; i++) {
           int snowballSnow2 = Integer.parseInt(scanner.nextLine());
            int snowballTime2 = Integer.parseInt(scanner.nextLine());
             int snowballQuality2 = Integer.parseInt(scanner.nextLine());
            double snowballValue=Math.pow(snowballSnow2*1.0/snowballTime2,snowballQuality2);
if (winner<snowballValue){
    winner=snowballValue;
    snowballSnow=snowballSnow2;
    snowballQuality=snowballQuality2;
    snowballTime=snowballTime2;
}
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnow,snowballTime,winner,snowballQuality);
    }
}
