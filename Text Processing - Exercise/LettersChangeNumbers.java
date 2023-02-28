package TextProcessing.exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codes = input.split("\\s+");

        double totalSum = 0;

        for (String code : codes) {
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter,' ')
                .trim());

        if(Character.isUpperCase(firstLetter)){
            int positionUpperNumber = (int) firstLetter - 64;
            number /= positionUpperNumber;
        } else {
            int positionLowerLetter = (int) firstLetter - 96;
             number *= positionLowerLetter;
        }
        if(Character.isUpperCase(secondLetter)){
            int positionUpperNumber = (int) secondLetter - 64;
            number -= positionUpperNumber;
        } else {
            int positionLowerLetter = (int) secondLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
