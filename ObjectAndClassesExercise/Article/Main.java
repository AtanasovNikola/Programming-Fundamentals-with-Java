package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleArr = scanner.nextLine().split(", ");
        int numOfArticles = Integer.parseInt(scanner.nextLine());
        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);
        for (int i = 1; i <= numOfArticles; i++) {
            String command = scanner.nextLine();
            String change = command.split(": ")[1];
            if (command.contains("Edit")) {
                article.setContent(change);
            } else if (command.contains("ChangeAuthor")) {
                article.setAuthor(change);
            } else if (command.contains("Rename")) {
                article.setTitle(change);
            }
        }
        System.out.println(article);
    }
}
