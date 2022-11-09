package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCommands = Integer.parseInt(scanner.nextLine());
        Map<String, String> map = new LinkedHashMap<>();
        for (int commands = 1; commands <= numOfCommands; commands++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]) {
                case "register":
                    if (map.containsKey(command[1])) {
                        System.out.printf("ERROR: already registered with plate number %s%n", map.get(command[1]));
                        continue;
                    }
                    map.putIfAbsent(command[1], " ");
                    map.put(command[1], command[2]);
                    System.out.printf("%s registered %s successfully%n", command[1], command[2]);
                    break;

                case "unregister":
                    if (!map.containsKey(command[1])) {
                        System.out.printf("ERROR: user %s not found%n", command[1]);
                    } else {
                        System.out.printf("%s unregistered successfully%n", command[1]);
                        map.remove(command[1]);
                    }
                    break;

            }
        }
        map.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
