package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Pens = Integer.parseInt(scanner.nextLine());
        int Markers = Integer.parseInt(scanner.nextLine());
        int Liters = Integer.parseInt(scanner.nextLine());
        int Discount = Integer.parseInt(scanner.nextLine());

        double PenPrice = Pens * 5.80;
        double MarkerPrice = Markers * 7.20;
        double PricePerLiter = Liters * 1.20;

        double totalPrice = PenPrice + MarkerPrice + PricePerLiter;
        double totalPriceDisc = totalPrice - (totalPrice * Discount / 100);

        System.out.println(totalPriceDisc);





        //double PenSum = Pens * PenPrice;
        //double MarkerSum = Markers * MarkerPrice;
        //double LiterSum = Liters * PricePerLiter;
        //double Sum = PenSum + MarkerSum + LiterSum;

        //double DiscountPrice = Discount / 100;
        //double result = Sum - (Sum * DiscountPrice);
        //System.out.println(result);




    }
}
