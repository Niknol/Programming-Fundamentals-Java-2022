package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double shoes = tax - (tax * 40 / 100.00);
        double clothes = shoes - (shoes * 20 / 100);
        double ball = clothes / 4;
        double access = ball / 5;
        double result = tax + shoes + clothes + ball + access;
        System.out.println(result);

    }
}
