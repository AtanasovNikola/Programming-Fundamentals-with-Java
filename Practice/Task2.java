package Practice;

import java.util.Scanner;

import static java.lang.System.in;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int N= Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=N && i<=9 ; i++) {

            for (int j = 1; j <=N && j<=9 ; j++) {
                for (int k = 1; k <=N && k<=9 ; k++) {

                    for (int l = 1; l <N && l<=9 ; l++) {
                        if (i+j==k+l && N%(i+j)==0){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}
