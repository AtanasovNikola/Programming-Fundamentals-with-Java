package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        List<String> nameOfLists = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] commandArr = command.split(" - ");
            if (command.contains("Collect")) {
                if (!exist(nameOfLists, commandArr[1])) {
                    nameOfLists.add(commandArr[1]);
                }

            } else if (command.contains("Drop")) {
                if (exist(nameOfLists, commandArr[1])) {
                    nameOfLists.remove(commandArr[1]);
                }

            } else if (command.contains("Combine Items")) {
                String[] commandCombine = commandArr[1].split(":");
                if (exist(nameOfLists, commandCombine[0])) {
                    nameOfLists.add(index(nameOfLists, commandCombine[0]) + 1, commandCombine[1]);
                }

            } else if (command.contains("Renew")) {
                if (exist(nameOfLists, commandArr[1])) {
                    String currentItem = commandArr[1];
    nameOfLists.remove(commandArr[1]);
    nameOfLists.add(currentItem);
                }
            }

            command = scanner.nextLine();
        }
        for (int index = 0; index < nameOfLists.size() ; index++) {
            if (index== nameOfLists.size()-1){
                System.out.print(nameOfLists.get(index));
                break;
            }
            System.out.print(nameOfLists.get(index) + "," + " ");
        }
    }

    public static boolean exist(List<String> list, String item) {
        boolean exist = false;
        for (String items : list) {
            if (list.contains(item)) {
                exist = true;
            }
        }
        return exist;
    }

    public static int index(List<String> list, String item) {
        int theIndex = 0;
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).equals(item)) {
                theIndex = index;
                break;
            }
        }
        return theIndex;
    }

}
