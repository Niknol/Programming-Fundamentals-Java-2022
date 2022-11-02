package Methods.lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(n, inputLine));
    }
    public static String repeatString(int n, String text) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + text;
        }
        return result;
    }
}
