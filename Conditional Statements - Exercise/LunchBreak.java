package ConditionalStatements.exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int brake = Integer.parseInt(scanner.nextLine());

        double lunch = brake * 1/8;
        double relax = brake * 1/4;

        double time = Math.abs(brake - lunch - relax);

        if (time >= episode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, time - episode);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, episode - time);
        }
    }
}
//"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
//    • Ако времето не Ви е достатъчно:
//"You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."