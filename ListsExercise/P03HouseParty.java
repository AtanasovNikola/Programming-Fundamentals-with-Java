package ListsExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> namesList = new ArrayList<>();
        for (int i = 0; i < numOfCommands; i++) {
           String [] command = scanner.nextLine().split(" ");
            if (command[2].equals("going!")) {

                boolean exist = false;
                for (int j = 0; j < namesList.size(); j++) {
                    if (namesList.get(j).equals(command[0])) {
                        System.out.printf("%s is already in the list!%n", command[0]);
                        exist = true;
                        break;
                    }
                }
                if (!exist) {

                    namesList.add(command[0]);
                }
            } else {

                String[] finalCommand = command;
                boolean exist = false;
                for (int j = 0; j < namesList.size(); j++) {
                    if (namesList.get(j).equals(finalCommand[0])) {
                        exist = true;
                        break;
                    }
                }
                if (!exist) {

                    System.out.printf("%s is not in the list!%n", finalCommand[0]);

                }
                namesList.removeIf(e -> e.equals(finalCommand[0]));
            }

        }
        for (String names:namesList) {
            System.out.println(names);
        }

    }

}

