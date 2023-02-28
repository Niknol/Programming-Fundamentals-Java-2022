package AssociativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;


public class CountCharactersInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\s+", "");

        LinkedHashMap<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for(char symbol : text.toCharArray()){

           // if (symbol == ' '){
            //    continue;
           // }
            if(!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol, 1);
            } else {
                int value = symbolsCount.get(symbol);
                symbolsCount.put(symbol, value + 1);
            }
        }
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
