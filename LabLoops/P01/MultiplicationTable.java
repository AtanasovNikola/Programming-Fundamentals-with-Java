package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d X %d = %d%n", number,i,number*i);
        }
    }
}
