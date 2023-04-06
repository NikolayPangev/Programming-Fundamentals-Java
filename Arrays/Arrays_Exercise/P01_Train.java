package Arrays_Exercise;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int number : train) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
