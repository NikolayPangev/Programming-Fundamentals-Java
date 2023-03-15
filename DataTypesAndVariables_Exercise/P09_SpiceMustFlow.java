package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int left;
        int total = 0;

        while (startingYield >= 100) {
            countDays += 1;
            left = startingYield - 26;
            total += left;
            startingYield -= 10;
        }
        System.out.println(countDays);
        if (total >= 26) {
            total -= 26;
        }
        System.out.println(total);
    }
}
