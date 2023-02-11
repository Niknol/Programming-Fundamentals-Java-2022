package Methods.exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

           if (isSumOfDigitsDivisibleBy8(i) && isContainsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isSumOfDigitsDivisibleBy8(int num){
        int sumDigits = 0;
        while (num > 0){
            int lastDigit = num % 10;
            sumDigits += lastDigit;
            num = num / 10;
        }
       //return sumDigits & 8 == 0;
        if(sumDigits % 8 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isContainsOddDigit(int num){

        while(num > 0){
            int lastDigit = num % 10;
            if(lastDigit % 2 != 0){
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }
}
