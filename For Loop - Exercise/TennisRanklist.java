package ForLoop.exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int win = 0;

        for(int i = 1; i <= tournaments; i ++) {
            String positions = scanner.nextLine();

            if(positions.equals("W")){
               points += 2000;
               win++;
            } else if (positions.equals("F")){
               points += 1200;
            } else if (positions.equals("SF")){
                points += 720;
            }
        }

        double percentWin = win * 1.00 / tournaments * 100;
        int totalPoints = startPoints + points;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", points / tournaments);
        System.out.printf("%.2f%%", percentWin);
    }
}
