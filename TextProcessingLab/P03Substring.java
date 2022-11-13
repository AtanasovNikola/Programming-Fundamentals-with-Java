package TextProcessingLab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removeString = scanner.nextLine();
        String string =scanner.nextLine();
      int contains = string.indexOf(removeString);
        while (contains!=-1){
           string=  string.replace(removeString,"");
            contains=string.indexOf(removeString);
        }
        System.out.println(string);
    }
}
