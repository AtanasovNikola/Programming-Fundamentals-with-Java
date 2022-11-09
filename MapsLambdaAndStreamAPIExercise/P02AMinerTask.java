package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String command = scanner.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!map.containsKey(command)) {
                map.putIfAbsent(command, quantity);
                command=scanner.nextLine();
                continue;
            }
            map.put(command, map.get(command) + quantity);
            command = scanner.nextLine();
        }
        map.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
