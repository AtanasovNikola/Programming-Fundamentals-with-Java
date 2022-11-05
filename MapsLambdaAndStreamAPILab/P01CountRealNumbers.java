package MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double [] arr= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer> arrMap=new TreeMap<>();
        for (double num:arr) {
            arrMap.putIfAbsent(num,0);
            arrMap.put(num, arrMap.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> entry : arrMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
