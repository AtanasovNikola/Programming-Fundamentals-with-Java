package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> nameOfLists = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.contains("course start")) {
            String[] input = command.split(":");
            String firstIndex = input[1];
            switch (input[0]) {
                case "Add":
                    if (!commandExistInList(firstIndex,nameOfLists)){
                        nameOfLists.add(input[1]);
                    }
                    break;
                case "Insert":
                    if (!commandExistInList(firstIndex,nameOfLists)){
                        nameOfLists.add(Integer.parseInt(input[2]),input[1]);
                    }
                    break;
                case "Remove":
                    if (commandExistInList(firstIndex,nameOfLists)){
                        nameOfLists.remove(input[1]);
                    }
                    int indexLesson = nameOfLists.indexOf(firstIndex);
                    if(nameOfLists.get(indexLesson + 1).equals(firstIndex+"-Exercise")) {
                        nameOfLists.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String secondIndex=input[2];
                    if (commandExistInList(firstIndex,nameOfLists)){
                        if (commandExistInList(secondIndex,nameOfLists)){
                            swapping(firstIndex,secondIndex,nameOfLists);
                        }
                    }
                    String exOne = firstIndex + "-Exercise";
                    String exTwo = secondIndex + "-Exercise";
                    if (nameOfLists.contains(exOne)) {
                        nameOfLists.remove(nameOfLists.indexOf(exOne));
                        nameOfLists.add(nameOfLists.indexOf(firstIndex + 1), exOne);
                    }
                    if (nameOfLists.contains(exTwo)) {
                        nameOfLists.remove(nameOfLists.indexOf(exTwo));
                        nameOfLists.add(nameOfLists.indexOf(secondIndex) + 1, exTwo);
                    }
                    break;
                case "Exercise":
                    String exercise = firstIndex + "-Exercise";
                    //слагаме упражнение ако има лекция и го няма
                    int indexLessonTitle = nameOfLists.indexOf(firstIndex);
                    if(nameOfLists.contains(firstIndex)) {
                        //има ли упражнение
                        if(indexLessonTitle == nameOfLists.size() - 1) {
                            nameOfLists.add(indexLessonTitle + 1, exercise);
                        } else  if(!nameOfLists.get(indexLessonTitle + 1).equals(exercise)) {
                            nameOfLists.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        nameOfLists.add(firstIndex);
                        nameOfLists.add(exercise);
                    }
                    break;
            }


            command = scanner.nextLine();
            }
        for (int i = 1; i <=nameOfLists.size() ; i++) {
            System.out.println(i + "." + nameOfLists.get(i-1));
        }
    }
    public static boolean commandExistInList (String name , List<String> list ){
        boolean existInTheList = false;
        for (int i = 0; i <list.size() ; i++) {
        if (list.get(i).equals(name)){
            existInTheList=true;
            break;
        }
        }

        return existInTheList;
    }
    public static void swapping (String first , String second , List<String> list){
        String firstElement = first;
        String secondElement = second;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals(first)){
                list.set(i,secondElement);
            }
            else if (list.get(i).equals(second)){
                list.set(i,firstElement);
            }
        }
    }

}

