package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double fee = chickenMenu * 10.35 + fishMenu * 12.40 + veganMenu * 8.15;
        double desert = fee * 20 / 100;
        double total = fee + desert + 2.50;
        System.out.println(total);


    }
}
