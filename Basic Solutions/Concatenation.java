package FirstStepsInCoding.lab;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //"You are <firstName> <lastName>, a <age>-years old person from <town>."
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        //System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
        System.out.printf("You are %s %s, a %d-years old person from %s." , firstName, lastName, age, town);

    }
    }

