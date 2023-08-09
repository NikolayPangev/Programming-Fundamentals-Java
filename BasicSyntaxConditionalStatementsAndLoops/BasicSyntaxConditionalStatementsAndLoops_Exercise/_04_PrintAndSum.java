package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = startNum; i <= endNum; i++) {
            totalSum += i;
            System.out.print(i + " ");
        }
        System.out.printf("%nSum: %d", totalSum);
    }
}
