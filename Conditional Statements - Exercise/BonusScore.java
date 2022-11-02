package ConditionalStatements.exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (Number <= 100) {
            bonus = 5;
        } else if (Number > 1000) {
            bonus = Number * 0.1;
        } else {
            bonus = Number * 0.2;
        }
        if (Number % 2 == 0) {
            bonus = bonus + 1;
        } else if (Number % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(Number + bonus);
    }
}
