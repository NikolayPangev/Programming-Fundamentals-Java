package BasicSyntax_ConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int product = 0;

        for (int i = 1; i <= 10; i++) {
            product = i * number;
            System.out.printf("%d X %d = %d%n", number, i, product);
        }
    }
}
