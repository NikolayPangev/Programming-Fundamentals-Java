package DataTypesAndVariables_Lab;

import java.util.Scanner;

public class P11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, width, height, volume = 0;

        System.out.println("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.println("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.println("Height: ");
        height = Double.parseDouble(scanner.nextLine());

        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
