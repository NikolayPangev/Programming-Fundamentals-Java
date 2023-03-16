package Arrays_Lab;

import java.util.Scanner;

public class P04_ReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArray= input.split(" ");
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
