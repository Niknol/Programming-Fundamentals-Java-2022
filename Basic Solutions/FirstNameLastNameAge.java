package FirstStepsInCoding.lab;

import java.util.Scanner;

public class FirstNameLastNameAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        // Maria Ivanova @ 19
        String result = firstName + " " + lastName + " @ " + age;
        System.out.println(result);
    }
}
