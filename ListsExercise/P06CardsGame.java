package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        boolean deckIsEmpty = false;
        while (!deckIsEmpty) {
            int smallestList = 0;
            if (firstDeck.size() > secondDeck.size()) {
                smallestList = secondDeck.size();
            } else {
                smallestList = firstDeck.size();
            }
            for (int i = 0; i < smallestList; i++) {
                int firstNumber1 = firstDeck.get(0);
                int firstNumber2 = secondDeck.get(0);
                if (firstDeck.get(0) > secondDeck.get(0)) {
                    firstDeck.remove(firstDeck.get(0));
                    firstDeck.add(firstNumber1);
                    firstDeck.add(secondDeck.get(0));
                    secondDeck.remove(secondDeck.get(0));
                } else if (firstDeck.get(0) < secondDeck.get(0)) {
                    secondDeck.remove(secondDeck.get(0));
                    secondDeck.add(firstNumber2);
                    secondDeck.add(firstDeck.get(0));
                    firstDeck.remove(firstDeck.get(0));
                } else {
                    firstDeck.remove(firstDeck.get(0));
                    secondDeck.remove(secondDeck.get(0));
                }
            }
            if (firstDeck.size() == 0 || secondDeck.size() == 0) {
                deckIsEmpty = true;
            }
        }
        int sum = 0;
        if (firstDeck.size() == 0) {
            for (int total : secondDeck) {
                sum += total;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int total : firstDeck) {
                sum += total;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
