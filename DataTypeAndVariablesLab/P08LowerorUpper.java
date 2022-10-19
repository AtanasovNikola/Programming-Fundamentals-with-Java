package DataTypeAndVariablesLab;

import java.util.Scanner;

import static java.lang.System.in;

public class P08LowerorUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        char letter=scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letter)){
            System.out.printf("upper-case");
        }else{
            System.out.printf("lower-case");
        }

    }
}
