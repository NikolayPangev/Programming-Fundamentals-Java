package BasicSyntax_ConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class P10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceForLightsabers = Double.parseDouble(scanner.nextLine());
        double priceForRobes = Double.parseDouble(scanner.nextLine());
        double priceForBelts = Double.parseDouble(scanner.nextLine());

        double freeBelts;
        freeBelts = countStudents / 6;

        double sum = 0;
        sum = priceForLightsabers * (countStudents + Math.ceil(0.1 * countStudents)) + priceForRobes * countStudents + priceForBelts * (countStudents - freeBelts);
        if (sum <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", (sum - money));
        }
    }
}
