package Methods_Lab;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int even = evenSum(Math.abs(number));
        int odd = oddSum(Math.abs(number));
        int result = even * odd;
        System.out.println(result);

    }

    public static int evenSum(int num) {
        String toString = String.valueOf(num);
        int even = 0;
        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 == 0) {
                even += currentNum;
            }
        }
        return even;
    }

    public static int oddSum(int num) {
        String toString = String.valueOf(num);
        int odd = 0;
        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 != 0) {
                odd += currentNum;
            }
        }
        return odd;
    }
}
