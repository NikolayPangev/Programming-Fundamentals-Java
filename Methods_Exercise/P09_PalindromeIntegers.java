package Methods_Exercise;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {
            if (isPalindrome(command)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            command = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String text) {
        String reversedText = "";
        for (int index = text.length() - 1; index >= 0; index--) {
            reversedText += text.charAt(index);
        }
        return text.equals(reversedText);
    }
}
