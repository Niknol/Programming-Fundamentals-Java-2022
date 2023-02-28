package TextProcessing.exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if(isValidUsername(username)){
                System.out.println(username);
            }
        }
    }
    public static boolean isValidUsername(String username){
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;
        boolean isValidContent = false;
        for (char symbol : username.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        isValidContent = true;
        return isValidLength && isValidContent;
    }
}

