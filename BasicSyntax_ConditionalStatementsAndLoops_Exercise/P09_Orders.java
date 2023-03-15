package BasicSyntax_ConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double totalSum = 0;

        for (int i = 0; i < number; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            sum = ((days * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
            totalSum += sum;
        }

        System.out.printf("Total: $%.2f", totalSum);
    }
}
