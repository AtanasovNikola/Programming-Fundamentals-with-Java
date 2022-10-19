package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxPeopleInWagon = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            String [] commandArray = command.split(" ");
            if (command.contains("Add")){

                        listOfWagons.add(Integer.parseInt(commandArray[1]));



            }else{
                for (int i = 0; i <listOfWagons.size() ; i++) {
                    if (listOfWagons.get(i) + Integer.parseInt(commandArray[0])<=maxPeopleInWagon){
                        listOfWagons.set(i,Integer.parseInt(commandArray[0])+listOfWagons.get(i));
                        break;
                    }
                }
            }
            command= scanner.nextLine();
        }
        for (int numbers:listOfWagons) {
            System.out.print(numbers + " ");
        }
    }
}
