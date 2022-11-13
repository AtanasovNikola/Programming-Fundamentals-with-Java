package TextProcessingLab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        StringBuilder repeatedStrings= new StringBuilder();
        for (int times = 0; times < strings.length ; times++) {
            String currentString =strings[times];
            for (int index = 0; index <currentString.length() ; index++) {
                repeatedStrings.append(currentString);
            }
        }
        System.out.println(repeatedStrings);
    }

}
