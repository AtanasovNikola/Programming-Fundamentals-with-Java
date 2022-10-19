package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class TriangleofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n= Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.printf("%d ",i);
            }
            System.out.println();
        }

    }
}
