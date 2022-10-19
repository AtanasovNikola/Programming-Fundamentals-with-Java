package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int man= Integer.parseInt(scanner.nextLine());
        int woman= Integer.parseInt(scanner.nextLine());
        int tables= Integer.parseInt(scanner.nextLine());
        int counter=0;

        for (int i = 1; i <=man ; i++) {
            for (int j = 1; j <=woman ; j++) {
                System.out.printf("(%d <-> %d) ",i,j);
                counter+=1;
                if (counter==tables){
                    return;
            }
                }
        }
    }
}
