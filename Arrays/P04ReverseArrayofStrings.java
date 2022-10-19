package Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class P04ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


     // 1.  String values = scanner.nextLine();
        // String [] letters= values.split(" ");
      //  for (int i = letters.length-1; i >=0 ; i--) {
        //    System.out.printf("%s ",letters[i]);

     //2.
String [] inputArr = scanner.nextLine().split(" ");
        for (int i = 0; i < inputArr.length/2; i++) {
            String oldElement = inputArr[i];
inputArr[i]=inputArr[inputArr.length-1-i];
inputArr[inputArr.length-1-i]=oldElement;
        }
        System.out.println(String.join(" ", inputArr));

        }
    }

