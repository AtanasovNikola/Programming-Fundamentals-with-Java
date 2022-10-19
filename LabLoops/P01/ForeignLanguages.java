package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String country = scanner.nextLine();
        switch (country){
            case "USA":
            case "England":
                System.out.printf("English");break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.printf("Spanish");break;
            default:
                System.out.printf("unknown");break;

        }
    }
}
