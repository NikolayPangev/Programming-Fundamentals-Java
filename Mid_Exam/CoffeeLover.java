package Mid_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffees = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        while (num < n) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            switch (tokens[0]) {
                case "Include":
                    coffees.add(tokens[1]);
                    break;
                case "Remove":
                    int number = Integer.parseInt(tokens[2]);
                    if (coffees.size() < number) {
                        continue;
                    } else {
                        if (tokens[1].equals("first")) {
                            for (int i = 0; i < number; i++) {
                                coffees.remove(0);
                            }
                        } else if (tokens[1].equals("last")) {
                            for (int i = 0; i < number; i++) {
                                coffees.remove(coffees.size() - 1);
                            }
                        }
                    }
                    break;
                case "Prefer":
                    int num1 = Integer.parseInt(tokens[1]);
                    int num2 = Integer.parseInt(tokens[2]);
                    if (num1 >= coffees.size() || num1 < 0 || num2 >= coffees.size() || num2 < 0) {
                        continue;
                    } else {
                        Collections.swap(coffees, num1, num2);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
            }
            num++;
        }
        System.out.println("Coffees:");
        for (String item : coffees) {
            System.out.print(item + " ");
        }
    }
}
