package BasicSyntax_ConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;

        switch (typeGroup) {
            case "Students":
                if (day.equals("Friday")) {
                    price += 8.45;
                } else if (day.equals("Saturday")) {
                    price += 9.80;
                } else if (day.equals("Sunday")) {
                    price += 10.46;
                }
                if (numPeople >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price += 10.90;
                } else if (day.equals("Saturday")) {
                    price += 15.60;
                } else if (day.equals("Sunday")) {
                    price += 16;
                }
                if (numPeople >= 100) {
                    numPeople -= 10;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price += 15;
                } else if (day.equals("Saturday")) {
                    price += 20;
                } else if (day.equals("Sunday")) {
                    price += 22.50;
                }
                if (numPeople >= 10 && numPeople <= 20){
                    price *= 0.95;
                }
                break;
        }

        totalPrice = numPeople * price;
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
