package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n= Integer.parseInt(scanner.nextLine());
        int currentNumber=n;
        int sum = 0;
        while(n>0){
            currentNumber=n%10;
            sum+=currentNumber;
           n/= 10;
        }
        System.out.println(sum);
    }
}
