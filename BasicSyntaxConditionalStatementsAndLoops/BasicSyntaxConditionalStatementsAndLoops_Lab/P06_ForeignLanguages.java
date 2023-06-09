package BasicSyntax_ConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String county = scanner.nextLine();

        switch (county) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
