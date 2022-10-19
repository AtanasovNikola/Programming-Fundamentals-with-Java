package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] inPut = command.split(" ");
            switch (inPut[0]) {
                case "Contains":
                    if (listOfNumbers.contains(Integer.parseInt(inPut[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (inPut[1].equals("even")) {
                        for (int evenNumber : listOfNumbers) {
                            if (evenNumber % 2 == 0) {
                                System.out.print(evenNumber + " ");
                            }
                        }
                        System.out.println();
                    } else {

                        for (int oddNumber : listOfNumbers) {
                            if (oddNumber % 2 == 1) {
                                System.out.print(oddNumber + " ");
                            }
                        }
                        System.out.println();
                    }

                    break;

                case "Get":
                    int sum = 0;
                    for (int num : listOfNumbers) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (inPut[1]) {
                        case "<":
                            for (int currentNum : listOfNumbers) {
                                if (currentNum < Integer.parseInt(inPut[2])) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int currentNum : listOfNumbers) {
                                if (currentNum > Integer.parseInt(inPut[2])) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                                break;

                        case ">=":
                            for (int currentNum : listOfNumbers) {
                                if (currentNum >= Integer.parseInt(inPut[2])) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int currentNum : listOfNumbers) {
                                if (currentNum <= Integer.parseInt(inPut[2])) {
                                    System.out.print(currentNum + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }

            }
            command = scanner.nextLine();
        }
    }
}


