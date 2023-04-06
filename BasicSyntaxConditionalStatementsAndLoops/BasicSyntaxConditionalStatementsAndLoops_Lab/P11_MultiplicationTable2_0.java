package BasicSyntax_ConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P11_MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int product = 0;

        for (int i = secondNumber; i <= 10; i++) {
            product = i * number;
            System.out.printf("%d X %d = %d%n", number, i, product);
        }

        if (secondNumber > 10) {
            product = secondNumber * number;
            System.out.printf("%d X %d = %d%n", number, secondNumber, product);
        }
    }
}