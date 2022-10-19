package ListsLab;

import java.util.*;

import static java.lang.System.in;

public class P06ListofProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String currentProduct= scanner.nextLine();
            list.add(i-1,currentProduct);
        }
        Collections.sort(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(i+1 + "." + list.get(i));
        }
    }
}
