package MethodsExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String inPut = scanner.nextLine();
        middleChar(inPut);
    }
    public static void middleChar (String text) {
        if (text.length() % 2 == 1) {
            System.out.println(text.charAt((text.length()/2)));
        }else{
            System.out.print(text.charAt((text.length()/2)-1));
            System.out.print(text.charAt(text.length()/2));
        }
    }
}
