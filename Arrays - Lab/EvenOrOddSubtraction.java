package Arrays.lab;

import java.util.Scanner;
import java.util.Arrays;

public class EvenOrOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenNumTotal = 0;
        int oddNumTotal = 0;

        for (int number : numbers){
            if (number % 2 == 0){
                evenNumTotal += number;
            } else {
                oddNumTotal += number;
            }

        }
        System.out.println(evenNumTotal - oddNumTotal);
    }
}
