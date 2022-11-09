package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

public class P03Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] products = scanner.nextLine().split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        while (!products[0].equals("buy")) {
            String name = products[0];
            double price = Double.parseDouble(products[1]);
            int quantity = Integer.parseInt(products[2]);
            if (map.containsKey(name)) {
                map.putIfAbsent(name, quantity);
                products = scanner.nextLine().split("\\s+");

                continue;
            }
            map.put(name, quantity);

            products = scanner.nextLine().split("\\s+");
        }

    }
}

