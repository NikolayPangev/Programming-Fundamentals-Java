package BasicSyntax_ConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < number * 2; i++) {
            if (i % 2 == 1){
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
