package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentChar = scanner.nextLine().charAt(0);

        if (currentChar >= 65 && currentChar <= 90) {
            System.out.println("upper-case");
        } else if (currentChar >= 97 && currentChar <= 122) {
            System.out.println("lower-case");
        }
    }
}
