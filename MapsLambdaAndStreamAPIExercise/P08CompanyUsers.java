package MapsLambdaAndStreamAPIExercise;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] companyArr= scanner.nextLine().split(" -> ");
        Map<String, List<String>> map= new LinkedHashMap<>();
        while (!companyArr[0].equals("End")){
            map.putIfAbsent(companyArr[0], new ArrayList<>());
            if (!map.get(companyArr[0]).contains(companyArr[1])) {
                map.get(companyArr[0]).add(companyArr[1]);
            }

            companyArr= scanner.nextLine().split(" -> ");
        }
        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            System.out.printf("%s%n",stringListEntry.getKey());
            for (String id:stringListEntry.getValue()) {
                System.out.printf("-- %s%n",id);
            }
        }

    }
}
