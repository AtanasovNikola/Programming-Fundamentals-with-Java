package OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<People> peopleList =new ArrayList<>();
        while (!command.equals("End")) {
            String[] array = command.split(" ");
            String name = array[0];
            String ID = array[1];
            int age = Integer.parseInt(array[2]);
            People currentPerson = new People(name, ID, age);
            peopleList.add(currentPerson);

            command = scanner.nextLine();
        }
        peopleList.sort(Comparator.comparingInt(People::getAge));
        for (People people:peopleList) {
            System.out.println(people);
        }
    }
}
