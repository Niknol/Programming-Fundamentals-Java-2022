package WhileLoop.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int largestNum = Integer.MIN_VALUE;

        while(!input.equals("Stop")) {
        int num = Integer.parseInt(input);
        if(num > largestNum){
            largestNum = num;
        }
        input = scanner.nextLine();
        }
        System.out.println(largestNum);
    }
}
