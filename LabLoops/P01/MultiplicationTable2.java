package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d%n",number,times,number*times);

            times++;
        }while (times<=10);



    }
}
