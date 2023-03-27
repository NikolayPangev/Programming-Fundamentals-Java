package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.startsWith("Contains")) {
                int numToCheck = Integer.parseInt(command.split(" ")[1]);
                printContains(numbers, numToCheck);
            } else if (command.equals("Print even")) {
                printEvenNumbers(numbers);
            } else if (command.equals("Print odd")) {
                printOddNumbers(numbers);
            } else if (command.equals("Get sum")) {
                printSum(numbers);
            } else if (command.startsWith("Filter")) {
                String condition = command.split(" ")[1];
                int numToFilter = Integer.parseInt(command.split(" ")[2]);
                printFilteredNumbers(numbers, condition, numToFilter);
            }

            command = scanner.nextLine();
        }
    }

    public static void printContains(List<Integer> numbers, int numToCheck) {
        if (numbers.contains(numToCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void printFilteredNumbers(List<Integer> numbers, String condition, int numToFilter) {
        switch (condition) {
            case ">":
                for (int num : numbers) {
                    if (num > numToFilter){
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int num : numbers) {
                    if (num >= numToFilter){
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<":
                for (int num : numbers) {
                    if (num < numToFilter){
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int num : numbers) {
                    if (num <= numToFilter){
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}
