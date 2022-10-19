package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysCounter = 0;
        int currentYield = startingYield;
        int added = 0;
        int extracted=0;
        while (startingYield >= 100) {

            extracted+=startingYield-26;
            startingYield -= 10;
            daysCounter++;
            currentYield -= 26;
        }
        if (extracted<26){
            System.out.println(daysCounter);
            System.out.println(extracted);
        }else {
            extracted -= 26;
            System.out.println(daysCounter);
            System.out.println(extracted);
        }
    }
}
