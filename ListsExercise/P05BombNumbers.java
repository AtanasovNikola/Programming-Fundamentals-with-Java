package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bombAndPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bomb = bombAndPower[0];
        int power = bombAndPower[1];
        boolean detonated = false;
        int counter = 0 ;
        while(!detonated) {
            boolean moreBombs=false;
            for (int i = 0; i < power; i++) {
                if (listOfNumbers.indexOf(bomb) - power + i >= 0) {
                    listOfNumbers.remove(listOfNumbers.indexOf(bomb) - 1);
                }
                if (listOfNumbers.indexOf(bomb) + power - i <= listOfNumbers.size() - 1) {
                    listOfNumbers.remove(listOfNumbers.indexOf(bomb) + 1);
                }
            }
            listOfNumbers.remove(listOfNumbers.indexOf(bomb));
            for (int numbers:listOfNumbers) {
                if (numbers==bombAndPower[0]){
                    moreBombs=true;
                }
            }
            if (!moreBombs){
                detonated=true;
            }
        }

        int sum=0;
        for (int numbers:listOfNumbers) {
            sum+=numbers;
        }
        System.out.println(sum);
    }
}

