package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        int lostGames= Integer.parseInt(scanner.nextLine());
        double headsetPrice= Double.parseDouble(scanner.nextLine());
        double mousePrice= Double.parseDouble(scanner.nextLine());
        double keyboardPrice= Double.parseDouble(scanner.nextLine());
        double displayPrice= Double.parseDouble(scanner.nextLine());

        int brokenHeadsets = lostGames/2;
        int brokenMouses=lostGames/3;
        int brokenKeyboards=lostGames/6;
        int brokenDisplays=lostGames/12;

        double totalExpenses=(brokenDisplays*displayPrice)+(brokenHeadsets*headsetPrice)+(brokenKeyboards*keyboardPrice)+(brokenMouses*mousePrice);
        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);
    }
}
