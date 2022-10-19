package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",townName,population,area);
    }
}
