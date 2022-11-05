package MapsLambdaAndStreamAPILab;

import java.util.*;

import static java.lang.System.in;

public class P02WordSynonyms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(synonym);
        }
        //{word} - {synonym1, synonym2… synonymN}
        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            System.out.print(stringListEntry.getKey() + " - ");
            System.out.println(String.join(", ",stringListEntry.getValue()));
        }


    }
}
