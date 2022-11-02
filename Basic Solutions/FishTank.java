package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double degree = Double.parseDouble(scanner.nextLine());

        double aquarium = length * width * height;
        double aquariumInLiters = aquarium / 1000;
        double result = aquariumInLiters * (1 - (degree / 100));
        System.out.println(result);



    }
}
