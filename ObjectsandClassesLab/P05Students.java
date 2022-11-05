package ObjectsandClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    public static class Students {
        private String firstName;
        private String lastName;
        private int age;
        private String town;



        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> list = new ArrayList<>();
        String currentStudent = scanner.nextLine();
        while (!currentStudent.equals("end")) {
            String[] currentStudentArr = currentStudent.split(" ");
            String firstName = currentStudentArr[0];
            String lastName = currentStudentArr[1];
            int age = Integer.parseInt(currentStudentArr[2]);
            String town = currentStudentArr[3];
            Students students = new Students();
            students.setFirstName(firstName);
            students.setLastName(lastName);
            students.setAge(age);
            students.setTown(town);
            list.add(students);

            currentStudent = scanner.nextLine();
        }
        String command = scanner.nextLine();
        for (Students students: list) {
            if (students.getTown().equals(command)){
                System.out.printf("%s %s is %d years old%n", students.getFirstName(),students.getLastName(),students.getAge());
            }
        }

    }


}


