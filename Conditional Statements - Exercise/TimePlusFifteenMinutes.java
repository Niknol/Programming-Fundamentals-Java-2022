package ConditionalStatements.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMin = hour * 60 + min + 15;
        int newHour = totalMin / 60;
        int newMin = totalMin % 60;

        if (newHour == 24) {
            newHour = 0;
        }

        if (newMin < 10) {
            System.out.printf("%d:0%d", newHour, newMin);
        } else {
            System.out.printf("%d:%d", newHour, newMin);
        }

    }
}
