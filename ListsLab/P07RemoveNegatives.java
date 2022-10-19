package ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P07RemoveNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        listOfNumbers.removeIf(e -> e<0);
        Collections.reverse(listOfNumbers);
        if (listOfNumbers.isEmpty()){
            System.out.println("empty");
        }else {
            for (int nums : listOfNumbers) {
                System.out.print(nums + " ");
            }
        }
    }
}
