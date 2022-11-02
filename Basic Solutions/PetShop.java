package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //кучета е на цена 2.50 лв
        //котки струва 4 лв.
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double sum = dogFood * 2.50 + catFood * 4;
        System.out.println(sum + " lv.");

    }
}
