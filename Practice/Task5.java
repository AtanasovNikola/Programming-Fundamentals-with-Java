package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int diapason = Integer.parseInt(scanner.nextLine());
        int counter=0;

        for (int i = start; i <=end ; i++) {
            for (int j = start; j <=end ; j++) {
                counter++;
                if (i+j==diapason){
                System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,diapason);
                return;
                }

            }
        }
        System.out.printf("%d combinations - neither equals %d",counter,diapason);
    }
}
