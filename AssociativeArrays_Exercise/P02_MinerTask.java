package AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantitiy = Integer.parseInt(scanner.nextLine());

            if (!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantitiy);
            } else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantitiy);
            }
            resource = scanner.nextLine();
        }
        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
