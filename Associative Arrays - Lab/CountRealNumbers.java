package AssociativeArrays.lab;

import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).
                toArray();


        TreeMap<Double, Integer> countMap = new TreeMap<>();


        for(double num : numbersArray){
            // countMap.putIfAbsent(num, 0);
            // countMap.put(num, countMap.get(num) + 1);

            if(!countMap.containsKey(num)){
                countMap.put(num, 1);
            } else {
                int value = countMap.get(num);
                countMap.put(num, value + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
