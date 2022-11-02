package WhileLoop.exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String input = scanner.nextLine();
        int bookCount = 0;
        boolean isFound = false;


        while(!input.equals("No More Books")){

            if(input.equals(book)) {
                isFound = true;
                break;
            }
            bookCount++;
            input = scanner.nextLine();
        }
        if(isFound){
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        }
    }
}
