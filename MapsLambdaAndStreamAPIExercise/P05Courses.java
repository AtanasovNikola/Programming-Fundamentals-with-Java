package MapsLambdaAndStreamAPIExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] courseArr = scanner.nextLine().split(" : ");
        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!courseArr[0].equals("end")){
            map.putIfAbsent(courseArr[0], new ArrayList<>());
            map.get(courseArr[0]).add(courseArr[1]);

            courseArr=scanner.nextLine().split(" : ");
        }
        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            System.out.printf("%s: %d%n",stringListEntry.getKey(),stringListEntry.getValue().size());
            for (String name: stringListEntry.getValue()) {
                System.out.printf("-- %s%n",name);
            }
        }

    }
}
