package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class _11_MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num2 > 10){
            System.out.printf("%d X %d = %d%n",num1, num2, num1 * num2);
        }
        for (int i = num2; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num1, i, num1 * i);
        }
    }
}
