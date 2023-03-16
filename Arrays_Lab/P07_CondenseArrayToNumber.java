package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] condensed = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                break;
            }
            if (i == arr.length - 1){
                int[] condensedNew = new int[condensed.length - 1];
                i = -1;
                arr = condensed;
                condensed = condensedNew;
            } else {
                condensed[i] = arr[i] + arr[i + 1];
            }
        }
        System.out.println(arr[0]);
    }
}
