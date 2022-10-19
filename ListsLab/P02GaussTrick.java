package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (int index = 0; index < listOfNumbers.size() /2; index++) {
            int firstNumber = listOfNumbers.get(index);
            int lastNumber = listOfNumbers.get(listOfNumbers.size() - 1 - index);
            resultList.add(index, firstNumber + lastNumber);

        }
        if (listOfNumbers.size()%2==1){
            resultList.add(resultList.size(), listOfNumbers.get(listOfNumbers.size()/2));
        }

        for (int numbers:resultList) {
            System.out.print(numbers + " ");
        }
    }
}
