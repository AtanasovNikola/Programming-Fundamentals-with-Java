package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> mapUsernamePoints = new LinkedHashMap<>();
        Map<String, Integer> mapLanguageSubmissionsCount = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] inputArr = input.split("-");
            if (inputArr.length == 3) {
                String username = inputArr[0];
                String language = inputArr[1];
                int points = Integer.parseInt(inputArr[2]);
                mapUsernamePoints.putIfAbsent(username, points);
                if (points > mapUsernamePoints.get(username)) {
                    mapUsernamePoints.put(username, points);
                }

                mapLanguageSubmissionsCount.putIfAbsent(language, 0);
                int currentLanguageCount = mapLanguageSubmissionsCount.get(language);
                mapLanguageSubmissionsCount.put(language, currentLanguageCount + 1);
            } else if (inputArr.length == 2) {
                String username = inputArr[0];
                String command = inputArr[1];
                mapUsernamePoints.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Results:%n");
        mapUsernamePoints.forEach((key, value) -> System.out.printf("%s | %d%n", key, value));
        System.out.printf("Submissions:%n");
        mapLanguageSubmissionsCount.forEach((key, value) -> System.out.printf("%s - %d%n", key, value));
    }
}
