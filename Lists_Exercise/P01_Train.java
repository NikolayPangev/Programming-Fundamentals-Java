package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            if (commandParts[0].equals("Add")) {
                int passengers = Integer.parseInt(commandParts[1]);
                wagons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandParts[0]);
                for (int index = 0; index < wagons.size(); index++) {
                    int currentWagon = wagons.get(index);
                    if (currentWagon + passengersToAdd <= maxCapacity) {
                        wagons.set(index, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
