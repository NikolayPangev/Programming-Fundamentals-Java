package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String regex = "^([^><]+)>(?<number>(?:0\\d{2}|\\d{3}))\\|(?<lowerCase>[a-z]{3})\\|(?<upperCase>[A-Z]{3})\\|(?<symbol>[^><]{3})<\\1$";

        Pattern pattern = Pattern.compile(regex);

        for (int index = 0; index < num; index++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                if (matcher.matches()){
                    String number = matcher.group("number");
                    if (number.length() == 2) {
                        number = "0" + number;
                    }
                    String lowerCase = matcher.group("lowerCase");
                    String upperCase = matcher.group("upperCase");
                    String symbol = matcher.group("symbol");
                    System.out.printf("Password: %s%s%s%s%n", number, lowerCase, upperCase, symbol);
                }
            } else {
                System.out.println("Try another password!");
            }
        }
    }
}
