package Methods_Lab;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        calculatePrice(product, quantity);
    }

    private static void calculatePrice(String product, int quantity) {
        double sum;
        switch (product) {
            case "coffee":
                sum = quantity * 1.50;
                System.out.printf("%.2f", sum);
                break;
            case "water":
                sum = quantity * 1.00;
                System.out.printf("%.2f", sum);
                break;
            case "coke":
                sum = quantity * 1.40;
                System.out.printf("%.2f", sum);
                break;
            case "snacks":
                sum = quantity * 2.00;
                System.out.printf("%.2f", sum);
                break;
        }
    }
}
