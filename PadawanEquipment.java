package ExercisesLoops;

import java.util.Scanner;

import static java.lang.System.in;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        double GeorgeMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers= Double.parseDouble(scanner.nextLine());
        double priceOfRobes= Double.parseDouble(scanner.nextLine());
        double priceOfBelts= Double.parseDouble(scanner.nextLine());

        int freeBelts= countOfStudents/6;
        double neededLightSabers= Math.ceil(countOfStudents*0.1+countOfStudents);
        double neededMoney=priceOfLightSabers*neededLightSabers+priceOfRobes*countOfStudents+priceOfBelts*(countOfStudents-freeBelts);
        if (neededMoney<=GeorgeMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(neededMoney-GeorgeMoney));
        }
    }
}
