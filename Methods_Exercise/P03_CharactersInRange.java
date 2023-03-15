package Methods_Exercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printInRange(symbol1, symbol2);
    }

    public static void printInRange(char symbol1, char symbol2){
        if(symbol1 < symbol2){
            for (char symbol = (char)(symbol1 + 1);symbol  < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        } else if (symbol2 < symbol1) {
            for (char symbol = (char)(symbol2 + 1);symbol  < symbol1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
