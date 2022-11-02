package ConditionalStatements.exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double Sum = puzzle * 2.60 + doll * 3 + bear * 4.10 + minion * 8.20 + truck * 2;
        int totalToys = puzzle + doll + bear + minion + truck;

        if (totalToys > 50) {
            Sum = Sum - (0.25 * Sum);
        }
        double Profit = Sum - (0.10 * Sum);

        if (Profit >= trip) {
           double result = Profit - trip;
            System.out.printf("Yes! %.2f lv left.", Profit - trip);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", trip - Profit);
        }

    }
}
