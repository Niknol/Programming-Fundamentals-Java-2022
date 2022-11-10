package DataTypes.exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double largestKeg = Double.MIN_VALUE;
        String largestKegNum = "";


        for (int i = 1; i <= n ; i++) {
            String kegNum = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double currentKegVolume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;

            if (currentKegVolume > largestKeg) {
                largestKeg = currentKegVolume;
                largestKegNum = kegNum;
            }
        }
            System.out.print(largestKegNum);
        }
}
