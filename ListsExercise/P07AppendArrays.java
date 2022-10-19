package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

import static java.lang.System.in;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        List<String> output = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i--) {
            String[] numbers = input.get(i).split("\\s+");
            for (int j = 0; j < numbers.length; j++) {
                if (!numbers[j].equals("")) {
                    output.add(numbers[j]);
                }
            }
        }

        String print = output.toString().trim();
        System.out.println(print.replaceAll("\\[|,|\\]", ""));
    }
}