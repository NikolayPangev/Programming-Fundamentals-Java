package Methods_Lab;

import java.util.Scanner;

public class P07_RepeatSting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        repeatString(text, num);
    }
    
    private static void repeatString(String text, int num){
        for (int i = 0; i < num; i++) {
            System.out.printf("%s", text);
        }
    }
}
