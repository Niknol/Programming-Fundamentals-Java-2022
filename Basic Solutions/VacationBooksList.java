package FirstStepsInCoding.exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Pages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int Days = Integer.parseInt(scanner.nextLine());

        int Hours = (Pages / PagesPerHour) / Days;
        System.out.println(Hours);
    }
}
