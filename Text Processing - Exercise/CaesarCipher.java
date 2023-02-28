package TextProcessing.exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for(char symbol : text.toCharArray()){
            char encryptSymbol = ((char)(symbol + 3));
            encryptedText.append(encryptSymbol);
        }
        System.out.println(encryptedText);
    }
}
