package MethodsExercise;

import java.util.Scanner;

public class P03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        diapason(symbol1,symbol2);
    }
    public static void diapason(char symbol1 , char symbol2){
        char lowestSymbol=' ';
        char biggerSymbol = ' ';
        if (symbol1>symbol2){
            lowestSymbol=symbol2;
            biggerSymbol=symbol1;
        }else{
            lowestSymbol=symbol1;
            biggerSymbol=symbol2;
        }
        for (int start = lowestSymbol; start <biggerSymbol -1; start++) {
            System.out.print((char)(start+1));
            System.out.print(" ");
        }
    }
}
