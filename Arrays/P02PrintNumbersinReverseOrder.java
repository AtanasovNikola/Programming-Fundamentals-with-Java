package Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P02PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());

        int [] arr= new int[n];
        for (int i = 0; i <n ; i++) {
            int currentNumber= Integer.parseInt(scanner.nextLine());

            arr [i] = currentNumber;
        }
        for (int i = n-1; i >=0 ; i--) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
