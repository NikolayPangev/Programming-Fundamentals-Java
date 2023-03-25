package Arrays_Ecersice;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumbers = numbers[index];

            int leftSum = 0;
            int rightSum = 0;

            //calculating the left sum
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            //calculating the right sum
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }

            if (leftSum == rightSum){
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
