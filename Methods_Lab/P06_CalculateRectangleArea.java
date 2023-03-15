package Methods_Lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int area = (int) getRectangleArea(width, height);
        System.out.println(area);
    }

    private static double getRectangleArea(int width, int height){
        return width * height;
    }
}
