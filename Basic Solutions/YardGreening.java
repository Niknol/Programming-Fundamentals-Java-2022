package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на вход
        double area = Double.parseDouble(scanner.nextLine());
        //Изчисления
        double priceWithoutDiscount = area * 7.61;
        // 18% отстъпка от крайната цена
        double discount = priceWithoutDiscount * 0.18;
        double finalPrice = priceWithoutDiscount - discount;
        // Принтиране на резултата
        System.out.printf("The final price is: %f lv.",finalPrice);
        System.out.println();
        System.out.printf("The discount is: %f lv.",discount);


    }
}
