package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int oneLeva= Integer.parseInt(scanner.nextLine());
        int twoLeva= Integer.parseInt(scanner.nextLine());
        int fiveLeva= Integer.parseInt(scanner.nextLine());
        int sum= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <=oneLeva ; i++) {
            for (int j = 0; j <=twoLeva ; j++) {
                for (int k = 0; k <=fiveLeva ; k++) {
                    if ((i)+(j*2)+(k*5)==sum)
                    System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,(i)+(j*2)+(k*5));
                }
            }
        }
    }
}
