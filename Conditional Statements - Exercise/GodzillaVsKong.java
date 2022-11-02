package ConditionalStatements.exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decor = 0.10 * Budget;
        double newClothes = statist * clothes;

        if (statist > 150){
           newClothes = newClothes - (0.10 * newClothes);
        }
        double DC = decor + newClothes;

        if (DC > Budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", DC - Budget);
        } else if(Budget > DC) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Budget - DC);
        }
    }
}
//    • Ако  парите за декора и дрехите са повече от бюджета:
//        ◦ "Not enough money!"
//        ◦ "Wingard needs {парите недостигащи за филма} leva more."
//    • Ако парите за декора и дрехите са по малко или равни на бюджета:
//        ◦ "Action!"
//        ◦ "Wingard starts filming with {останалите пари} leva left."
//Резултатът трябва да е форматиран до втория знак след десетичната запетая.
