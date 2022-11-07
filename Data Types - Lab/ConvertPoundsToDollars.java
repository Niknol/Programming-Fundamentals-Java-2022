package DataTypes.lab;

import java.util.Scanner;

public class ConvertPoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pound = Float.parseFloat(scanner.nextLine());
        float dollars = pound * 1.36f;

        System.out.printf("%.3f", dollars);

    }
}
