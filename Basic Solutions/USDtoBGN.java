package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD = Double.parseDouble(scanner.nextLine());
        double BGN = USD * 1.79549;
        //double result = USD * BGN;
        System.out.println(BGN);
    }
}
