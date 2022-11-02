package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Radian = Double.parseDouble(scanner.nextLine());
//градус = радиан * 180 / π
        double Degree = Radian * 180 / Math.PI;
        System.out.println(Degree);
    }
}
