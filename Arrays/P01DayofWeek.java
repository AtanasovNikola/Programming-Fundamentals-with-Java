package Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P01DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] dayOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n = Integer.parseInt(scanner.nextLine());
        if (n>=1 && n<=7){
            System.out.println(dayOfWeek[n-1]);
        }else{
            System.out.printf("Invalid day!");
        }



    }
}
