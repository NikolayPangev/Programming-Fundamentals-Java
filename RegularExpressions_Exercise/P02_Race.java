package RegularExpressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String names = scanner.nextLine();
        List<String> racersNames = Arrays.stream(names.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> racersDistances = new LinkedHashMap<>();

        racersNames.forEach(racer -> racersDistances.put(racer, 0));

        String lettersRegex = "[A-Za-z]";
        Pattern patternLetter = Pattern.compile(lettersRegex);

        String digitsRegex = "[0-9]";
        Pattern patternDigit = Pattern.compile(digitsRegex);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);
            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }

            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }

            String racerName = nameBuilder.toString();
            if (racersNames.contains(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        for (int index = 0; index <= 2; index++) {
            String racer = racersNames.get(index);
            if (index == 0) {
                System.out.println("1st place: " + racer);
            } else if (index == 1) {
                System.out.println("2nd place: " + racer);
            } else if (index == 2) {
                System.out.println("3rd place: " + racer);
            }
        }

    }
}
