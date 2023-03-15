package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumDigits = 0;

        while (num > 0) {
            int digit = num % 10;
            sumDigits += digit;
            num /= 10;
        }
        System.out.println(sumDigits);
    }
}
