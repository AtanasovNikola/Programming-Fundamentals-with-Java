package RegularExpressionsExercise;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] participants = scanner.nextLine().split(", ");
        Map<String, Integer> racerAndDistance = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            StringBuilder distance = new StringBuilder();
            String letters = "[A-Za-z]";
            String digits = "[\\d]";
            Pattern patternLetters = Pattern.compile(letters);
            Pattern patternDigits = Pattern.compile(digits);
            Matcher matcherLetters = patternLetters.matcher(input);
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherLetters.find()) {
                name.append(matcherLetters.group());
            }
            int sum = 0;
            while (matcherDigits.find()) {
                sum += Integer.parseInt(matcherDigits.group());
            }
            if (contains(name, participants)) {
                if (racerAndDistance.containsKey(name.toString())) {
                    racerAndDistance.put(name.toString(), sum + racerAndDistance.get(name.toString()));
                } else {
                    racerAndDistance.put(name.toString(), sum);
                }
            }


            input = scanner.nextLine();
        }


        List<String> topThree = racerAndDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("1st place: "+ topThree.get(0));
        System.out.println("2nd place: "+topThree.get(1));
        System.out.println("3rd place: "+topThree.get(2));
    }

    public static boolean contains(StringBuilder name, String[] participants) {
        for (int index = 0; index < participants.length; index++) {
            if (name.toString().equals(participants[index])) {
                return true;
            }
        }
        return false;
    }
}
