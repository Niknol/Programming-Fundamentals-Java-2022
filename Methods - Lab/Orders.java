package Methods.lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch(product){
            case "coffee":
                printTotalSum(quantity, 1.5);
                break;
            case "water":
                printTotalSum(quantity, 1);
                break;
            case "coke":
                printTotalSum(quantity, 1.4);
                break;
            case "snacks":
                printTotalSum(quantity, 2);
                break;
        }
    }
    public static void printTotalSum(int quantity, double price){
        double result = quantity * price;
        System.out.printf("%.2f", result);
    }

}
//    • coffee – 1.50
//    • water – 1.00
//    • coke – 1.40
//    • snacks – 2.00