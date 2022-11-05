package MidExam;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int dayOfAdventure = Integer.parseInt(scanner.nextLine());
        int numOfPlayers = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayPerPerson = Double.parseDouble(scanner.nextLine());
        double foodPerDayPerPerson = Double.parseDouble(scanner.nextLine());
        double totalWater = dayOfAdventure * numOfPlayers * waterPerDayPerPerson;
        double totalFood = dayOfAdventure * numOfPlayers * foodPerDayPerPerson;

        for (int days = 1; days <= dayOfAdventure; days++) {
            double lostEnergy = Double.parseDouble(scanner.nextLine());
            groupEnergy -= lostEnergy;
            if (groupEnergy <= 0) {
                break;
            }
            if (days % 2 == 0) {
                groupEnergy += groupEnergy * 0.05;
                totalWater -= totalWater * 0.3;
            }
            if (days % 3 == 0) {
                totalFood -= totalFood / numOfPlayers;
                groupEnergy += groupEnergy * 0.1;
            }
        }
        if (groupEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", groupEnergy);
        }else{
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.",totalFood,totalWater);
        }
    }
}


