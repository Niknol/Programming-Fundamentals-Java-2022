package Methods.lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

       int result = printArea(width, length);
        System.out.println(result);

       // System.out.println(printArea(width, length));

    }
    public static int printArea(int a, int b){
        return a * b;
    }
}
