package Methods_Lab;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        int result = 0;

        switch (operator) {
            case "+":
                result = sumNum(num1, num2);
                System.out.println(result);
                break;
            case "-":
                result = subtractNum(num1, num2);
                System.out.println(result);
                break;
            case "*":
                result = multiplyNum(num1, num2);
                System.out.println(result);
                break;
            case "/":
                result = divideNum(num1, num2);
                System.out.println(result);
                break;
        }
    }

    public static int sumNum(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractNum(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyNum(int num1, int num2) {
        return num1 * num2;
    }

    public static int divideNum(int num1, int num2) {
        return num1 / num2;
    }

}
