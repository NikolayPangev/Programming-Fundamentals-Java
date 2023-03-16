package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenOrOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        int sumDifference = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else if (numbers[i] % 2 != 0) {
                sumOdd += numbers[i];
            }
        }
        sumDifference = sumEven - sumOdd;
        System.out.println(sumDifference);
    }
}
