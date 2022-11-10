package DataTypes.exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int waterQuantity = Integer.parseInt(scanner.nextLine());
            sum += waterQuantity;
            if(sum > waterTankCapacity){
                System.out.println("Insufficient capacity!");
                sum -= waterQuantity;
            }
        }
        System.out.println(sum);
    }
}
