package BasicSyntax_ConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        StringBuilder output = new StringBuilder();

        for (int i = startNumber; i <= endNumber; i++) {
            output.append(i + " ");
            sum += i;
        }
        System.out.println(output);
        System.out.printf("Sum: %d", sum);
    }
}
