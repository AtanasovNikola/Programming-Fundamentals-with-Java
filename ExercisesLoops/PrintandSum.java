package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = start; i <=end ; i++) {
sum+=i;
            System.out.printf("%d ",i);
        }
        System.out.println("");
        System.out.println("Sum: "+sum);
    }
}
