package MidExam_Retake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BooksWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> favoriteGenres = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\s*\\|\\s*")));

        while (true) {
            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("Stop!")) {
                break;
            }

            switch (command[0]) {
                case "Join":
                    String genreToAdd = command[1];
                    if (!favoriteGenres.contains(genreToAdd)) {
                        favoriteGenres.add(genreToAdd);
                    }
                    break;
                case "Drop":
                    String genreToRemove = command[1];
                    favoriteGenres.remove(genreToRemove);
                    break;
                case "Replace":
                    String oldGenre = command[1];
                    String newGenre = command[2];
                    if (favoriteGenres.contains(oldGenre) && !favoriteGenres.contains(newGenre)) {
                        int index = favoriteGenres.indexOf(oldGenre);
                        favoriteGenres.set(index, newGenre);
                    }
                    break;
                case "Prefer":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    if (index1 >= 0 && index1 < favoriteGenres.size() && index2 >= 0 && index2 < favoriteGenres.size()) {
                        String genre1 = favoriteGenres.get(index1);
                        String genre2 = favoriteGenres.get(index2);
                        favoriteGenres.set(index1, genre2);
                        favoriteGenres.set(index2, genre1);
                    }
                    break;
            }
        }

        for (String genre : favoriteGenres) {
            System.out.print(genre + " ");
        }
    }
}
