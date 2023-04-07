package MidExam_Retake;
import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandData = command.split(" ");
            switch (commandData[0]) {
                case "Delete":
                    int deleteIndex = Integer.parseInt(commandData[1]);
                    if (deleteIndex >= 0 && deleteIndex < text.size() - 1) {
                        text.remove(deleteIndex + 1);
                    }
                    break;
                case "Swap":
                    String word1 = commandData[1];
                    String word2 = commandData[2];
                    int index1 = text.indexOf(word1);
                    int index2 = text.indexOf(word2);
                    if (index1 != -1 && index2 != -1) {
                        Collections.swap(text, index1, index2);
                    }
                    break;
                case "Put":
                    String word = commandData[1];
                    int putIndex = Integer.parseInt(commandData[2]);
                    if ((putIndex - 1) >= 0 && (putIndex - 1) <= text.size()) {
                        if (putIndex == text.size()) {
                            text.add(word);
                        } else {
                            text.add(putIndex - 1, word);
                        }
                    }
                    break;
                case "Sort":
                    Collections.sort(text, Collections.reverseOrder());
                    break;
                case "Replace":
                    String replaceWord1 = commandData[1];
                    String replaceWord2 = commandData[2];
                    int replaceIndex = text.indexOf(replaceWord2);
                    if (replaceIndex != -1) {
                        text.set(replaceIndex , replaceWord1);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (String word : text) {
            System.out.print(word + " ");
        }
    }
}

