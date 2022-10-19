package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numOfVagons = Integer.parseInt(scanner.nextLine());
        int [] peopleInVagons = new int[numOfVagons];
        int sum=0;
        for (int i = 0; i < peopleInVagons.length ; i++) {
            peopleInVagons [i]= Integer.parseInt(scanner.nextLine());
            System.out.print(peopleInVagons[i] +" ");
            sum += peopleInVagons[i];
        }
        System.out.printf("%n%d",sum);;

    }
}
