package DataTypes.exercise;

import java.util.Scanner;

public class PrintPartOfCharTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstIndex = Integer.parseInt(scanner.nextLine());
        int lastIndex = Integer.parseInt(scanner.nextLine());

        for (int i = firstIndex; i <= lastIndex ; i++) {
            char currentChar = (char)i;
            System.out.print(currentChar + " ");
        }
    }
}
