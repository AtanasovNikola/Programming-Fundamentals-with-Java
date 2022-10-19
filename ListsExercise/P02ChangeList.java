package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = listOfNumbers.size();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            if (command.contains("Delete")) {
                listOfNumbers.removeIf(e-> e==Integer.parseInt(commandArray[1]));

            } else if (command.contains("Insert")) {
                listOfNumbers.add(Integer.parseInt(commandArray[2]), Integer.parseInt(commandArray[1]));
            }
            command = scanner.nextLine();
        }
        for (int numbers : listOfNumbers) {
            System.out.print(numbers + " ");
        }
    }
}
