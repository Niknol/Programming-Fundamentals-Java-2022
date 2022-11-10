package DataTypes.exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > 0){

           //int lastDigit = num % 10;
            // sum+=lastDigit
            sum += num % 10;
            num = num / 10; //-last digit
        }

        System.out.println(sum);
    }
}
