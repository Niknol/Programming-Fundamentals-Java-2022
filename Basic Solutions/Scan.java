package FirstStepsInCoding.lab;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
