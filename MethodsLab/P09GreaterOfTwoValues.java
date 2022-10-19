package MethodsLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String command = scanner.nextLine();
        switch (command) {
            case "int": {
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(greater(num1,num2));
                break;
            }
            case "char": {
                char symbol1=scanner.nextLine().charAt(0);
                char symbol2=scanner.nextLine().charAt(0);
                System.out.println(greater(symbol1,symbol2));
                break;
            }
            case "string": {
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(greater(text1,text2));
            }
        }
    }
    public static int greater (int num1 , int num2){
        if (num1>num2){
        return num1;
        }else{
            return num2;
        }

    }
    public static char greater (char symbol1,char symbol2){
        if (symbol1>symbol2){
            return symbol1;
        }else {
            return symbol2;
        }
    }
    public static String greater (String text1 , String text2){
        if (text1.compareTo(text2)>=0){
            return text1;
        }else{
            return text2;
        }
    }
}
