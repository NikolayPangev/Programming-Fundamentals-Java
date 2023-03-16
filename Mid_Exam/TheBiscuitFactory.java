package Mid_Exam;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfBiscuits = Integer.parseInt(scanner.nextLine());
        int countWorkers = Integer.parseInt(scanner.nextLine());
        int produce = Integer.parseInt(scanner.nextLine());

        int productionForADay = numOfBiscuits * countWorkers;
        int produceForEveryThirdDay = (int) Math.floor(0.75 * productionForADay);
        int totalProduce = 20 * productionForADay + produceForEveryThirdDay * 10;
        System.out.printf("You have produced %d biscuits for the past month.%n", totalProduce);

        double difference = 0;
        double percentage;
        if (totalProduce > produce) {
            difference = totalProduce - produce;
            percentage = (difference / produce) * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        } else if (totalProduce < produce) {
            difference = produce - totalProduce;
            percentage = difference / produce * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percentage);
        }
    }
}
