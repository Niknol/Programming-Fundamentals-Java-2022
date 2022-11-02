package MidExam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double freeFlour = 0;

        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0){
                freeFlour++;
            }

        }
        double apronCount = (students + (0.20 * students));
        double finalApronPrice = (apronPrice * (int)Math.ceil(apronCount));

        double Items = finalApronPrice
                + eggPrice * 10 * students + flourPrice * (students - freeFlour);

        if(Items <= budget){
            System.out.printf("Items purchased for %.2f$.", Items);
        } else {
            System.out.printf("%.2f$ more needed.", Items - budget);
        }
    }
}
//Needed items for 2 students  :
//apronPrice * (students + 20%) + eggPrice * 10 * (students) + flourPrice * (students - freePackages)
//10 * (3) + 0.10 * 10 * (2) + 1 * (2) = 34.00
//34.00 <= 50 – the budget is enough.