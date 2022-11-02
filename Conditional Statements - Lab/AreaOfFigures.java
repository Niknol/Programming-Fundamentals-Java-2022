package ConditionalStatements.lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double result = a * a;
            System.out.println(result);
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double result2 = a * b;
            System.out.println(result2);
        } else if (figure.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double result3 = a * a * Math.PI;
            System.out.println(result3);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double result4 = (a * h) / 2;
            System.out.println(result4);
        }
    }
}
