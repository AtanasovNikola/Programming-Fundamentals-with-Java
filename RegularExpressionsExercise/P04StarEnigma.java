package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	The first line holds n – the number of messages – integer in the range [1…100].
        //•	On the next n lines, you will be receiving encrypted messages.
        int numOfMassages = Integer.parseInt(scanner.nextLine());
        int destroyedPlanets = 0;
        int attackedPlanets = 0;
        // A||D lists
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        // iterate all messages
        for (int messages = 1; messages <= numOfMassages; messages++) {
            String input = scanner.nextLine();
            StringBuilder decrypted = new StringBuilder();
            //count the letters(s,t,a,r)
            int count = count(input);
            // decrypted
            for (char currentSymbol : input.toCharArray()) {
                char newSymbol = (char) (currentSymbol - count);
                decrypted.append(newSymbol);
            }
            Pattern pattern = Pattern.compile("[^@,-,!,:,>]*[@](?<planet>[A-Za-z]+)[^@,-,!,:,>]*[:](?<population>[\\d]+)[^@,-,!,:,>]*" +
                    "[!](?<attackType>A||D)![^@,-,!,:,>]*[->](?<soldiersCount>[\\d]+)[^@,-,!,:,>]*");
            Matcher matcher = pattern.matcher(decrypted);
            // add the message to the list
            if (matcher.find()) {
                if (matcher.group("attackType").equals("D")) {
                    destroyedPlanets++;
                    destroyed.add(matcher.group("planet"));
                } else if (matcher.group("attackType").equals("A")) {
                    attackedPlanets++;
                    attacked.add(matcher.group("planet"));
                }
            }
        }

      List<String> sortAttacked = attacked.stream().sorted().collect(Collectors.toList());
      List<String> sortDestroyed = destroyed.stream().sorted().collect(Collectors.toList());
        //"Attacked planets: {attackedPlanetsCount}"
        //"-> {planetName}"
        //"Destroyed planets: {destroyedPlanetsCount}"
        //"-> {planetName}"
        System.out.printf("Attacked planets: %d%n", attackedPlanets);
        sortAttacked.forEach(e-> System.out.printf("-> %s%n",e));
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets);
        sortDestroyed.forEach(e-> System.out.printf("-> %s%n",e));
    }

    public static int count(String input) {
        int counter = 0;
        for (int index = 0; index < input.length(); index++) {
            char currentSymbol = input.charAt(index);
            switch (currentSymbol) {
                case 's':
                case 'S':
                case 't':
                case 'T':
                case 'a':
                case 'A':
                case 'r':
                case 'R':
                    counter++;
                    break;
            }
        }
        return counter;
    }

}
