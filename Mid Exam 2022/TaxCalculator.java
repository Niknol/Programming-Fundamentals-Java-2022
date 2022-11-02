package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = scanner.nextLine().split(">>");
        double total = 0;

        for (int i = 0; i < cars.length; i++) {
            String[] vehicle = cars[i].split(" ");
            String carType = vehicle[0];
            int taxCount = Integer.parseInt(vehicle[1]);
            int kilometers = Integer.parseInt(vehicle[2]);

            int Tax = 0;
            int taxDecline = 0;

            double taxIncrease = 0;
            double totalTaxes = 0;

            if (carType.equals("family")) {
                Tax = 50;
                taxDecline = taxCount * 5;
                taxIncrease = kilometers / 3000 * 12;

                totalTaxes = Tax - taxDecline + taxIncrease;
            }
            else if (carType.equals("heavyDuty")) {
                Tax = 80;
                taxDecline = taxCount * 8;
                taxIncrease = kilometers / 9000 * 14;
                totalTaxes = Tax - taxDecline + taxIncrease;
            }
            else if (carType.equals("sports")) {
                Tax = 100;
                taxDecline = taxCount * 9;
                taxIncrease = kilometers / 2000 * 18;
                totalTaxes = Tax - taxDecline + taxIncrease;
            }
            else {
                System.out.println("Invalid car type.");
                continue;
            }
            total += totalTaxes;
            System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, totalTaxes);
        }

        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n", total);
    }
}