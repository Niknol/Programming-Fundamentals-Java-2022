package ConditionalStatements.exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int card = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double newCard = 250 * card;
        double newProcessor = (0.35 * newCard) * processor;
        double newRAM = (0.10 * newCard) * RAM;

        double Total = newCard + newProcessor + newRAM;

        if (card > processor) {
            Total = Total - (0.15 * Total);
        }

        if (budget > Total) {
            System.out.printf("You have %.2f leva left!", budget - Total);
        } else if (budget < Total) {
            System.out.printf("Not enough money! You need %.2f leva more!", Total - budget);
        }
    }
}
