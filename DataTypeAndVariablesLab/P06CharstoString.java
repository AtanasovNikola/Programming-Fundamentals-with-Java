package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P06CharstoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String firstSymbol = scanner.nextLine();
        String secondSymbol = scanner.nextLine();
        String thirdSymbol = scanner.nextLine();

        System.out.println(firstSymbol+secondSymbol+thirdSymbol);
    }
}
