package TextProcessing.lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {  //(symbol >= '0' && symbol <= '9'){
                digitSb.append(symbol);
            } else if (Character.isLetter(symbol)) { //(symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z') {
            letterSb.append(symbol);
            } else {
                otherSb.append(symbol);
            }
        }
        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
