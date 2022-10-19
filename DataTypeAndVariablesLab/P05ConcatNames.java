package DataTypeAndVariablesLab;

import java.util.Scanner;



import static java.lang.System.in;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String firstName= scanner.nextLine();
        String secondName= scanner.nextLine();
        String delimiter= scanner.nextLine();
        System.out.println(firstName + delimiter + secondName);
    }
}
