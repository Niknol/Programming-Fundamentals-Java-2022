package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        int totalNylon = nylon + 2;
        double totalPaint = paint + (paint * 10 / 100.00);

        double priceM = totalNylon * 1.50 + totalPaint * 14.50 + thinner * 5.00 + 0.40;
        double priceWorkman = ( priceM * 30 / 100) * workHours;

        double totalPrice = priceM + priceWorkman;
        System.out.println(totalPrice);





    }
}
