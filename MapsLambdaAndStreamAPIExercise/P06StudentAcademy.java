package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String , List<Double>> map = new LinkedHashMap<>();
        for (int rows = 1; rows <= num; rows++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            map.putIfAbsent(studentName,new ArrayList<>());
            map.get(studentName).add(grade);
        }

        for (Map.Entry<String, List<Double>> stringListEntry : map.entrySet()) {
            double sum = 0;
            for (double grade:stringListEntry.getValue()) {
                sum+=grade;
            }
            if (sum/stringListEntry.getValue().size()>=4.5){
                System.out.printf("%s -> %.2f%n",stringListEntry.getKey(),sum/stringListEntry.getValue().size());
            }
        }

    }
}
