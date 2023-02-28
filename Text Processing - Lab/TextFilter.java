package TextProcessing.lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : bannedWordsArr){
            text = text.replaceAll(banWord, repeatString("*", banWord.length()));
        }
        System.out.println(text);
    }

    public static String repeatString (String s, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }
}
