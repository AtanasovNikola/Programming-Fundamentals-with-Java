package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int days= Integer.parseInt(scanner.nextLine());
        int hours= Integer.parseInt(scanner.nextLine());
        double price=0;
        double total=0;

        for (int day = 1; day <=days ; day++) {
        double totalPerDay=0;

            for (int hour = 1; hour <=hours ; hour++) {
                if (day%2==0&&hour%2!=0){
                    price=2.50;
                }else if(day%2!=0&&hour%2==0){
                    price=1.25;
                }else{
                    price=1;
                }
                totalPerDay+=price;
                total +=price;
            }
                System.out.printf("Day: %d - %.2f leva%n",day,totalPerDay);
        }
        System.out.printf("Total: %.2f leva",total);
    }
}
