package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int meters= Integer.parseInt(scanner.nextLine());
        double km= meters/1000.0;
        System.out.printf("%.2f",km);
    }
}
