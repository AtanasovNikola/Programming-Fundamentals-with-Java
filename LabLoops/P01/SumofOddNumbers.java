package LabLoops.P01;

import java.util.Scanner;

import static java.lang.System.in;

public class SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = 1; i <=n*2 ; i++) {
            if (i%2==1){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
