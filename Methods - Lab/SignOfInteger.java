package Methods.lab;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentNum = Integer.parseInt(scanner.nextLine());

        printNum(currentNum);
    }

    public static void printNum(int num) {

            if (num > 0){
                System.out.printf("The number %d is positive.", num);
            } else if (num < 0){
                System.out.printf("The number %d is negative.", num);
            } else {
                System.out.printf("The number %d is zero.", num);
            }



        }

    }

