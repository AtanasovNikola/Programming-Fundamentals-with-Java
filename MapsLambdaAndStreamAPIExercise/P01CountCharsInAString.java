package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String command = scanner.nextLine();
        Map<Character, Integer> symbols = new LinkedHashMap();
        for (int index = 0; index < command.length(); index++) {

            char currentSymbol = command.charAt(index);
            if (currentSymbol==' '){
                continue;
            }
            symbols.putIfAbsent(currentSymbol,0);
            symbols.put(currentSymbol,symbols.get(currentSymbol)+1);

        }

        symbols.entrySet().forEach(entry -> System.out.printf("%s -> %d%n",entry.getKey() , entry.getValue()));
    }
}
