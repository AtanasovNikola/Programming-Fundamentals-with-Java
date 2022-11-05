package OpinionPoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        for (int people = 1; people <=N ; people++) {
            String [] person = scanner.nextLine().split(" ");
            String name = person[0];
            int age = Integer.parseInt(person[1]);
            Person currentPerson = new Person(name,age);
            if (currentPerson.getAge()>30){
                System.out.println(currentPerson);
            }
        }
    }
}
