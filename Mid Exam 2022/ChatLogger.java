package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chatMessages = new ArrayList<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")) {
            String[] Commands = inputLine.split(" ");
            String command = Commands[0];


            if (command.equals("Chat")) {
                String message = Commands[1];
                addMessage(chatMessages, message);
            } else if (command.equals("Delete")) {
                String message = Commands[1];
                if (isMessageExist(chatMessages, message)) {
                    delete(chatMessages, message);
                }
            } else if (command.equals("Edit")) {
                String message = Commands[1];
                String editedVersion = Commands[2];

                if (isMessageExist(chatMessages, message)) {
                    edit(chatMessages, message, editedVersion);
                }

            } else if (command.equals("Pin")) {
                String message = Commands[1];

                if (isMessageExist(chatMessages, message)) {
                    pin(chatMessages, message);
                }
            } else if (command.equals("Spam")) {
                String[] messages = Commands;
                spam(chatMessages, messages);
            }


            inputLine = scanner.nextLine();
        }

        printLog(chatMessages);
    }

    private static void spam(List<String> chatMessages, String[] messages) {
        for (int i = 1; i < messages.length; i++) {
            chatMessages.add(messages[i]);
        }
    }

    private static void pin(List<String> chatMessages, String message) {
        chatMessages.remove(message);
        chatMessages.add(message);
    }

    private static void edit(List<String> chatMessages, String message, String editedVersion) {
        int messageIndex = chatMessages.indexOf(message);
        chatMessages.set(messageIndex, editedVersion);
    }

    private static void delete(List<String> chatMessages, String message) {
        chatMessages.remove(message);
    }

    private static boolean isMessageExist(List<String> chatMessages, String message) {
        return chatMessages.contains(message);
    }

    private static void printLog(List<String> chatMessages) {
        for (String message : chatMessages) {
            System.out.println(message);
        }
    }

    private static void addMessage(List<String> chatMessages, String message) {
        chatMessages.add(message);
    }
}
