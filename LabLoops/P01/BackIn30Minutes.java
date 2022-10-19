package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60) + minutes + 30;
        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;
        if (newHours>23){
            newHours=0;
        }
        System.out.printf("%d:%02d",newHours,newMinutes);
    }
}
