package TextProcessingLab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder reversedInput = new StringBuilder();
        while (!input.equals("end")) {
            for (int index = input.length() - 1; index >= 0; index--) {
                reversedInput.append(input.charAt(index));
            }
            input=scanner.nextLine();
        }
        System.out.printf("%s = %s",input,reversedInput);
    }
}
