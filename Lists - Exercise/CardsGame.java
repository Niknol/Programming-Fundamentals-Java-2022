package Lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int firstPlayerSum = 0;
        int secondPlayerSum = 0;

        for (int currentCard = 0; currentCard <= firstPlayer.size() - 1; currentCard++) {
            int current = firstPlayer.get(currentCard);
            firstPlayerSum+=current;
        }
        for (int card = 0; card < secondPlayer.size() - 1; card++) {
            int currentCard = secondPlayer.get(card);
            secondPlayerSum+=currentCard;
        }

        if (firstPlayerSum>=secondPlayerSum){
            System.out.printf("First player wins! Sum: %d", firstPlayerSum);
        } else {
            System.out.printf("Second player wins! Sum: %d", secondPlayerSum);
        }
    }
}
