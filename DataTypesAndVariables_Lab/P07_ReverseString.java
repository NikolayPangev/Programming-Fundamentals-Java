package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class P07_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = "";
        String second = "";

        for (int i = 0; i < 3; i++) {
            char character = scanner.nextLine().charAt(0);
            first += character;
        }

        for (int i = first.length() - 1; i >= 0; i--) {
            char character = first.charAt(i);
            second += character + " ";
        }
        System.out.println(second);
    }
}
