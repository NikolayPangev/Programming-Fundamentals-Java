package Methods_Exercise;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            if(isContainingOddDigit(i) && isSumOfDigitsDivisibleBy8(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isSumOfDigitsDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean isContainingOddDigit(int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }
}
