package TextProcessingLab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int index = 0; index < bannedArr.length; index++) {
        StringBuilder replacement = new StringBuilder();
            String currentBannedWord = bannedArr[index];
            int currentBannedWordLength = currentBannedWord.length();
            for (int count = 1; count <= currentBannedWordLength; count++) {
                replacement.append("*");
            }
           text= text.replace(currentBannedWord,replacement);
        }
        System.out.println(text);
    }
}
