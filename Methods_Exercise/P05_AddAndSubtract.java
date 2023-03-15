package Methods_Exercise;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int sum = addNum(num1, num2);
        int subtraction = subtractNum(sum, num3);
        System.out.println(subtraction);

    }

    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractNum(int sum, int num3) {
        return sum - num3;
    }
}
