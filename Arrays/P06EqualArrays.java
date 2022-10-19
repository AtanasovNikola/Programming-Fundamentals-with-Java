package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
int sum = 0;
int index =0;
boolean isIdentical = true;
        for (int i = 0; i <first.length ; i++) {
            if (first[i]==second[i]){
                sum+=first[i];
                index ++;
            }else{
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                isIdentical=false;
                break;
            }
        }

if (isIdentical){
    System.out.printf("Arrays are identical. Sum: %d",sum);
}

    }
}
