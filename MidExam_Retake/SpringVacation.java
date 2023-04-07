package MidExam_Retake;

import java.util.Scanner;

public class SpringVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int numPeople = Integer.parseInt(scanner.nextLine());
        double priceForFuelPerKilometer = Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPerson = Double.parseDouble(scanner.nextLine());
        double roomPricePerPerson = Double.parseDouble(scanner.nextLine());

        double totalExpenses = 0;
        if (numPeople > 10) {
            double discountRoomPrice = roomPricePerPerson - 0.25 * roomPricePerPerson;
            totalExpenses = days * numPeople * (foodExpensesPerPerson + discountRoomPrice);
        } else {
            totalExpenses = days * numPeople * (foodExpensesPerPerson + roomPricePerPerson);
        }

        for (int day = 1; day <= days; day++) {
            if (totalExpenses > budget){
                //System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", totalExpenses - budget);
                break;
            }
            double traveledDistance = Double.parseDouble(scanner.nextLine());
            double expensesForTraveledKilometers = traveledDistance * priceForFuelPerKilometer;
            totalExpenses += expensesForTraveledKilometers;

            if (day % 3 == 0 || day % 5 == 0) {
                totalExpenses = totalExpenses + 0.40 * totalExpenses;
            }

            if (day % 7 == 0){
                double addedMoney = totalExpenses / numPeople;
                totalExpenses -= addedMoney;
            }
        }

        if (budget >= totalExpenses){
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - totalExpenses);
        } else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", totalExpenses - budget);
        }
    }
}
