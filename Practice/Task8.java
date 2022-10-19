package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int first= Integer.parseInt(scanner.nextLine());
        int second= Integer.parseInt(scanner.nextLine());
        int diffFirst= Integer.parseInt(scanner.nextLine());
        int diffSecond= Integer.parseInt(scanner.nextLine());
        int tillFirst=first+diffFirst;
        int tillSecond=second+diffSecond;

        for (int i = first; i <=tillFirst ; i++) {
            for (int j = second; j <=tillSecond ; j++) {
if (i%2!=0 && j %2!=0 && i%3!=0 && j%3!=0 && i%5!=0 && j%5!=0 && i%7!=0 &&j%7!=0){
    System.out.printf("%d%d%n",i,j);
}
            }
        }
    }
}
