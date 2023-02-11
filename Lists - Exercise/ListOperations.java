package Lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("End")){
            if(command.contains("Add")){
                int numToAdd = Integer.parseInt(command.split(" ")[1]);
                numbersList.add(numToAdd);
            } else if (command.contains("Insert")){
                int numToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if(isValidIndex(index, numbersList)){
                    numbersList.add(index, numToInsert);
                }else{
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")){
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if(isValidIndex(indexToRemove, numbersList)){
                    numbersList.remove(indexToRemove);
                }else{
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Shift left")){
                int countShiftLeft = Integer.parseInt(command.split(" ")[2]);
                for (int time = 1; time <= countShiftLeft ; time++) {
                    int firstNumber = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNumber);
                }
            } else if (command.contains("Shift right")){
                int countShiftRight = Integer.parseInt(command.split(" ")[2]);
                for (int time = 0; time <= countShiftRight; time++) {
                    int lastNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNumber);
                }
            }

            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isValidIndex(int index, List<Integer> numbers){
        return index >= 0 && index <= numbers.size() - 1;
    }
}
