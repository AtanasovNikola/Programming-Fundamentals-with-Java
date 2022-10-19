package Practice;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] mainArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] condensedArray=new int[mainArray.length-1];

        if (mainArray.length==1){
            System.out.println(mainArray[0]);
            return;
        }
        for (int i = 0; i <mainArray.length ; i++) {
            for (int j = 0; j <condensedArray.length-i ; j++) {
                condensedArray[j]=mainArray[j]+mainArray[j+1];
            }
            mainArray=condensedArray;
        }
        System.out.println(condensedArray[0]);
    }
}
