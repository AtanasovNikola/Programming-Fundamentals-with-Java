package MapsLambdaAndStreamAPILab;

import java.util.*;

import static java.lang.System.in;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] array = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();
        for (String arr : array) {
            arr = arr.toLowerCase();
            counts.putIfAbsent(arr, 0);
            counts.put(arr, counts.get(arr) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : counts.entrySet()) {
            if (stringIntegerEntry.getValue() % 2 == 1) {
                list.add(stringIntegerEntry.getKey());

            }
        }
        for (int index = 0; index <list.size() ; index++) {
            if (index==list.size()-1){
                System.out.print(list.get(index));
            }else {
                System.out.print(list.get(index) + ", ");
            }
        }

    }
}
