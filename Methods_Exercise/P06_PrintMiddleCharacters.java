package Methods_Exercise;

import java.util.Scanner;

public class P06_PrintMiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }

    public static void printMiddleCharacter(String text) {
        if (text.length() % 2 != 0) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.print(text.charAt(indexOfMiddleCharacter));
        } else {
            int indexOfFirstCharacter = text.length() / 2 - 1;
            int indexOfSecondCharacter = text.length() / 2;
            System.out.print(text.charAt(indexOfFirstCharacter));
            System.out.print(text.charAt(indexOfSecondCharacter));

        }
    }
}
