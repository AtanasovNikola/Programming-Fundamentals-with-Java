package DataTypeAndVariablesExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int targets=0;
        int currentPower=power;

        while (distance<=currentPower){
            currentPower-=distance;
            targets++;
            if (power/2==currentPower){
                if(currentPower!=0&&factor!=0) {
                    currentPower /= factor;
                }
            }

        }
        System.out.printf("%d%n",currentPower);
        System.out.printf("%d",targets);
    }
}
