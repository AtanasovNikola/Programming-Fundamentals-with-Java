package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char firstSymbol=scanner.nextLine().charAt(0);
        char secondSymbol=scanner.nextLine().charAt(0);
        char thirdSymbol=scanner.nextLine().charAt(0);
        System.out.printf("%c %c %c",thirdSymbol,secondSymbol,firstSymbol);
    }
}
