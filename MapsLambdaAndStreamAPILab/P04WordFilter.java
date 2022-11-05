package MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String[] array = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w->w.length()%2==0)
                .toArray(String[]::new);
        for (String arr:array) {
            System.out.println(arr);
        }
    }
}
