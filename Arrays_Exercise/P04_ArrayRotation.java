package Arrays_Exercise;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= countRotations; rotations++) {
            String firstElements = numbers[0];
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firstElements;
        }

        for (String element : numbers) {
            System.out.print(element + " ");
        }
    }
}
