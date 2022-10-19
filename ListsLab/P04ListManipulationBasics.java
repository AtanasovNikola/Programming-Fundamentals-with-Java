package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] inPut = command.split(" ");
            switch (inPut[0]) {
                case "Add":
                    listOfNumbers.add(listOfNumbers.size(),Integer.parseInt(inPut[1]));
                    break;
                case "Remove":
                    listOfNumbers.remove(Integer.valueOf(Integer.parseInt(inPut[1])));
                    break;
                case "RemoveAt":
                    listOfNumbers.remove(Integer.parseInt(inPut[1]));
                    break;
                case "Insert":
                    listOfNumbers.add(Integer.parseInt(inPut[2]), Integer.parseInt(inPut[1]));
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(listOfNumbers.toString().replaceAll("[\\[\\],]" , ""));
    }
}
