package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P05AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(sum(n1,n2),n3));
    }
    public static int sum (int n1, int n2){
        subtract(n1,n2);
        return n1+n2;
    }
    public static int subtract (int n1, int n2 ){
        return n1-n2;
    }
}
