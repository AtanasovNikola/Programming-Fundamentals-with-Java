package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int index = 0; index < numberList.size() -1  ; index++) {
            double firstNumber = numberList.get(index);
            double secondNumber = numberList.get(index + 1);
            double sumResult = 0;
            if (firstNumber == secondNumber) {
                sumResult = firstNumber + secondNumber;
                numberList.set(index,sumResult);
                numberList.remove(index+1);
                index=-1;
            }
        }

        for (double numbers :numberList) {

        DecimalFormat print = new DecimalFormat("0.##");
        System.out.print(print.format(numbers)+ " ");
        }

    }
}

