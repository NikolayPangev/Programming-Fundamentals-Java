package BasicSyntax_ConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P04_BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());

        int allMin = inputHours * 60 + inputMinutes + 30;

        int hours = allMin / 60;
        int minutes = allMin % 60;

        if(hours > 23){
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
