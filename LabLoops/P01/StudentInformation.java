package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class StudentInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

    String name= scanner.nextLine();
    int age = Integer.parseInt(scanner.nextLine());
    double grade = Double.parseDouble(scanner.nextLine());

    System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);

    }
}
