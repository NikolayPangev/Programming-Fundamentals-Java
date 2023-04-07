package FinalExam;

import java.util.Scanner;

public class P01_StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder builder = new StringBuilder();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Translate")) {
                String[] data = command.split(" ");
                char givenChar = data[1].charAt(0);
                char givenReplacement = data[2].charAt(0);
                text = text.replace(givenChar, givenReplacement);
                System.out.println(text);
            } else if (command.contains("Includes")) {
                String givenSubstring = command.split(" ")[1];
                if (text.contains(givenSubstring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.contains("Start")) {
                String startSubstring = command.split(" ")[1];
                if (text.startsWith(startSubstring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.contains("Lowercase")) {
                text = text.toLowerCase();
                System.out.println(text);

            } else if (command.contains("FindIndex")) {
                String[] data = command.split(" ");
                char givenCharIndex = data[1].charAt(0);
                System.out.println(text.lastIndexOf(givenCharIndex));
            } else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int count = Integer.parseInt(command.split(" ")[2]);
                /*text = text.substring(0, startIndex) + text.substring(startIndex, count);
                System.out.println(text);*/
                builder = new StringBuilder(text);
                builder.delete(startIndex,startIndex + count);
                System.out.println(builder.toString());
            }
            command = scanner.nextLine();
        }
    }
}
