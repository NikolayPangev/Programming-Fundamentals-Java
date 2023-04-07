package FinalExam;

import java.util.*;

public class P03_WildZoo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> animalFoodMap = new LinkedHashMap<>();
        Map<String, List<String >> areaAnimalsMap = new LinkedHashMap<>();

        while (!input.equals("EndDay")) {
            String[] data = input.split(": ");
            String command = data[0];
            String[] commandArray = data[1].split("-");
            String animalName = commandArray[0];
            int foodQuantity = Integer.parseInt(commandArray[1]);
            int currentFood;
            String area;

            if (command.contains("Add")){
                area = commandArray[2];
                if (!animalFoodMap.containsKey(animalName)) {
                    animalFoodMap.put(animalName, foodQuantity);
                    List<String> animals = new ArrayList<>();
                    if (!areaAnimalsMap.containsKey(area)) {
                        animals.add(animalName);
                        areaAnimalsMap.put(area, animals);
                    } else {
                        animals = areaAnimalsMap.get(area);
                        animals.add(animalName);
                        areaAnimalsMap.put(area, animals);
                    }
                } else {
                    currentFood = animalFoodMap.get(animalName);
                    animalFoodMap.put(animalName, foodQuantity + currentFood);
                }
            } else if (command.contains("Feed")) {
                if (animalFoodMap.containsKey(animalName)) {
                    currentFood = animalFoodMap.get(animalName);
                    animalFoodMap.put(animalName, currentFood - foodQuantity);
                    if (animalFoodMap.get(animalName) <= 0) {
                        for (Map.Entry<String, List<String>> stringListEntry : areaAnimalsMap.entrySet()) {
                            stringListEntry.getValue().remove(animalName);
                                //System.out.println(animalName + " was successfully fed");
                        }
                        animalFoodMap.remove(animalName);
                    }
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalFoodMap.forEach((animal, food) -> System.out.printf(" %s -> %dg%n", animal, food));
        System.out.println("Areas with hungry animals:");
        areaAnimalsMap.forEach((area, value) -> System.out.printf("%s: %d%n", area, value.size()));
    }
}
