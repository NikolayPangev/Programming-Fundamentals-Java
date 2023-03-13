package DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int occupied = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters <= capacity) {
                capacity -= liters;
                occupied += liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(occupied);
    }
}
