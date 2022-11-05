package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Integer> priceRatingsList = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();
        int entryPoints = priceRatingsList.get(entryPoint);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        switch (typeOfItems) {
            case "cheap":
                for (int leftIndexes = 0; leftIndexes < entryPoint; leftIndexes++) {
                    if (priceRatingsList.get(leftIndexes) < entryPoints) {
                        left.add(priceRatingsList.get(leftIndexes));
                    }
                }
                for (int rightIndexes = entryPoint + 1; rightIndexes < priceRatingsList.size(); rightIndexes++) {
                    if (priceRatingsList.get(rightIndexes) < entryPoints) {
                        right.add(priceRatingsList.get(rightIndexes));
                    }
                }
                break;
            case "expensive":
                for (int leftIndexes = 0; leftIndexes < entryPoint; leftIndexes++) {
                    if (priceRatingsList.get(leftIndexes) >= entryPoints) {
                        left.add(priceRatingsList.get(leftIndexes));
                    }
                }
                for (int rightIndexes = entryPoint + 1; rightIndexes < priceRatingsList.size(); rightIndexes++) {
                    if (priceRatingsList.get(rightIndexes) >= entryPoints) {
                        right.add(priceRatingsList.get(rightIndexes));
                    }
                }
                break;
        }
        String position = "";
        int biggestNumber = 0;
        if (left.size() == 0) {
            position = "Right";
            biggestNumber = right.get(0);
        }
        if (right.size() == 0) {
            position = "Left";
            biggestNumber = left.get(left.size() - 1);
        }
        if (left.size() > 0 && right.size() > 0) {
            int sumLeft = 0;
            for (int leftIndexes : left) {
                sumLeft += leftIndexes;
            }
            int sumRight = 0;
            for (int rightIndexes : right) {
                sumRight += rightIndexes;
            }
            biggestNumber = Math.max(sumLeft, sumRight);
            if (biggestNumber == sumLeft) {
                position = "Left";
            } else {
                position = "Right";
            }
        }

        System.out.printf("%s - %d", position, biggestNumber);
    }
}
