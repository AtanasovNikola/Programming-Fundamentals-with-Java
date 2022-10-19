package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P02PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double pounds= Double.parseDouble(scanner.nextLine());
        double dollars= pounds*1.36;
        System.out.printf("%.3f",dollars);
    }
}
