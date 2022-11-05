package ObjectAndClassesExercise.Message;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        for (int numOfMessages = 1; numOfMessages <= n; numOfMessages++) {
rnd(phrases,events,authors,events);
        }
    }

    public static void rnd(String[] phrases, String[] events, String[] authors, String[] cities) {
        Random rnd = new Random();
        String currentPhrase = phrases[rnd.nextInt(5)];
        String currentEvent =events[rnd.nextInt(5)];
        String currentAuthors =authors[rnd.nextInt(7)];
        String currentCity =cities[rnd.nextInt(4)];
        Message message=new Message(currentPhrase,currentEvent,currentAuthors,currentCity);
        System.out.println(message);
    }
}
