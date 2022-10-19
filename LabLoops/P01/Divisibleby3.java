package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class Divisibleby3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        for (int i = 3; i <=99 ; i+=3) {
            System.out.println(i);
        }
    }
}

