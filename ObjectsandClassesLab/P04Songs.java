package ObjectsandClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class P04Songs {
    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList()
        {
            return typeList;
        }

        public void setTypeList(String typeList) {

            this.typeList = typeList;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public String getTime() {

            return time;
        }

        public void setTime(String time) {

            this.time = time;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> nameOfLists = new ArrayList<>();

        for (int song = 0; song < numberOfSongs; song++) {
            String[] songs = scanner.nextLine().split("_");
            String type = songs[0];
            String name = songs[1];
            String time = songs[2];
            Song song1 = new Song();
            song1.setName(name);
            song1.setTypeList(type);
            song1.setTime(time);
            nameOfLists.add(song1);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : nameOfLists) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : nameOfLists) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
