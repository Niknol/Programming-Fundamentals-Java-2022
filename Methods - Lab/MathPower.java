package Methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());

        double result = printPower(numInput, powerInput);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double printPower(double num, double power){
            double result = 1;
        for (int i = 1; i <= power; i++) {
             result = result * num;
        }
        return result;
    }
}
