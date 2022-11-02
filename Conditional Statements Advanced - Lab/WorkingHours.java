package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Double Num = Double.parseDouble(scanner.nextLine());
    if (Num < 100 && Num > 200 && Num == 0) {
            System.out.println("invalid");
    }

    }
}



// Дадено число е валидно, ако е в диапазона [100…200] или е 0.  Да се напише програма, която чете цяло число,
     //   въведено от потребителя, и печата "invalid" ако въведеното число не е валидно.