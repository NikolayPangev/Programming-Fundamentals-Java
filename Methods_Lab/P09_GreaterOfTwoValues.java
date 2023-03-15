package Methods_Lab;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                int result;
                result = getMax(num1, num2);
                System.out.println(result);
                break;
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                char resultChar;
                resultChar = getMax(first, second);
                System.out.println(resultChar);
                break;
            case "string":
                String firststr = scanner.nextLine();
                String secondstr = scanner.nextLine();
                String resultString;
                resultString = getMax(firststr, secondstr);
                System.out.println(resultString);
                break;
        }
    }

    static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }
}
