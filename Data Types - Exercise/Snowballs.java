package DataTypes.exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); //snowballNumber
        int bestValueTony = Integer.MIN_VALUE;
        int bestSnowValue = 0;
        int bestSnowTime = 0;
        int bestSnowQuality = 0;

        for (int Tony = 1; Tony <= n ; Tony++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int snowballValueTony = (int) Math.pow(Math.floor(snowballSnow/snowballTime), snowballQuality);

            if(snowballValueTony>bestValueTony){
                bestValueTony=snowballValueTony;
                bestSnowValue = snowballSnow;
                bestSnowTime = snowballTime;
                bestSnowQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", bestSnowValue, bestSnowTime, bestValueTony, bestSnowQuality);
    }
}
//    • On the first line, you will get the snowballSnow – an integer.
//    • On the second line, you will get the snowballTime – an integer.
//    • On the third line, you will get the snowballQuality – an integer.
//"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"