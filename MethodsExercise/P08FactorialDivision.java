package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
int n1= Integer.parseInt(scanner.nextLine());
int n2= Integer.parseInt(scanner.nextLine());
long factorialN1=factorial(n1);
long factorialN2=factorial(n2);
        System.out.printf("%.2f",result(factorialN1,factorialN2));

    }
    public static long factorial (long n){
        long factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial*=i;
        }
        return factorial;
    }
    public static double result (long n1 , long n2){
        return n1*1.0/n2;
    }
}
