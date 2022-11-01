package ObjectsandClassesLab;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class P01RandomizeWords {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(in);

    String input = scanner.nextLine();

    String [] wordArr= input.split("\\s+");

    Random rndGenerator = new Random();
        for (int i = 0; i < wordArr.length ; i++) {
            int indexX = rndGenerator.nextInt(wordArr.length);
            int indexY = rndGenerator.nextInt(wordArr.length);

            String oldWordX = wordArr[indexX];
            wordArr[indexX] = wordArr[indexY];
            wordArr[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(),wordArr));
    }
    
    
}
