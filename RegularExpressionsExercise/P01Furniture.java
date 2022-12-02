package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex =">>(?<name>[A-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)" ;
        List<String> furniture = new ArrayList<>();
        double sum = 0;
        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group("name");
                furniture.add(furnitureName);
                double price = Double.parseDouble(matcher.group("price"));
                int quantity =  Integer.parseInt(matcher.group("quantity"));
                sum += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Bought furniture:%n");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",sum);
    }
}
