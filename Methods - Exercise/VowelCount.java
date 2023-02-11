package Methods.exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printVowelCount(text.toLowerCase());
    }
    public static void printVowelCount (String text){

        int count = 0;
        for(char symbol : text.toCharArray()){
            if (symbol == 'o' || symbol == 'i' || symbol == 'u' || symbol == 'a' || symbol == 'e'){
                count++;
            }
        }
        System.out.println(count);
    }
}
