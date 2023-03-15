package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concatChars = "";

        for (int i = 0; i < 3; i++) {
            char symbol = scanner.nextLine().charAt(0);
            concatChars = concatChars + symbol;
        }
        System.out.println(concatChars);
    }
}
