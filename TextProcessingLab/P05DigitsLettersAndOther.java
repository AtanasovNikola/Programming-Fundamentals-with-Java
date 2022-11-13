package TextProcessingLab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int index = 0; index <input.length() ; index++) {
            char currentChar = input.charAt(index);
            if (Character.isDigit(currentChar)){
                digits.append(currentChar);
            }else if (Character.isLetter(currentChar)){
                letters.append(currentChar);
            }else{
                others.append(currentChar);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
