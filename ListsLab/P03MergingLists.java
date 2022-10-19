package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Integer> listOfNumbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> listOfNumbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        int smallest = Math.min(listOfNumbers1.size(), listOfNumbers2.size());

        for (int i = 0; i < smallest; i++) {
            result.add(listOfNumbers1.get(i));
            result.add(listOfNumbers2.get(i));
        }

        if (listOfNumbers1.size() > listOfNumbers2.size()) {
          result.addAll(listOfNumbers1.subList(smallest, listOfNumbers1.size() )) ;

        }else if(listOfNumbers2.size()>listOfNumbers1.size()){
            result.addAll(listOfNumbers2.subList(smallest, listOfNumbers2.size() )) ;
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]",""));
    }
}