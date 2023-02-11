package Lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("end")){
            if(command.contains("Delete")){
                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbersList.removeAll(Arrays.asList(numberToRemove));
            } else if (command.contains("Insert")){
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(index, numberToInsert);
            }
            command = scanner.nextLine();
        }
        //System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        for (int number:numbersList) {
            System.out.print(number + " ");
        }
    }
}
