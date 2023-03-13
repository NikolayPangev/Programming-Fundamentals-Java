package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) symbol;
            sum += asciiCode;
        }
        System.out.println("The sum equals: " + sum);
    }
}
