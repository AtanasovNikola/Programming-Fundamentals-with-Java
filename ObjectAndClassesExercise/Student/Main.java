package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();
        for (int numOfStudents = 1; numOfStudents <= n; numOfStudents++) {
            String[] currentStudent = scanner.nextLine().split(" ");
            String firstName = currentStudent[0];
            String lastName = currentStudent[1];
            double grade = Double.parseDouble(currentStudent[2]);
            Student currentStudent1 = new Student(firstName, lastName, grade);
            studentList.add(currentStudent1);
        }
        studentList.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        for (Student student:studentList) {
            System.out.println(String.valueOf(student));
        }
    }
}
