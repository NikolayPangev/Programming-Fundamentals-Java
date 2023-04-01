package AssociativeArrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] charInput = scanner.nextLine().split(" ");

        LinkedHashMap<Character, Integer> charsMap = new LinkedHashMap<>();
        for (int i = 0; i < charInput.length; i++) {
            for (int j = 0; j <charInput[i].length(); j++) {

                charsMap.putIfAbsent(charInput[i].charAt(j), 0);
                charsMap.put(charInput[i].charAt(j), charsMap.get(charInput[i].charAt(j)) + 1);
            }
        }

        charsMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
