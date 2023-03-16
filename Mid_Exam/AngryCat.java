import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        if(type.equals("cheap")){
            for (int i = 0; i < num; i++) {
                if(numbers.get(i) < numbers.get(num)){
                    leftSum += numbers.get(i);
                }
            }
            for (int i = num; i <numbers.size() -1 ; i++) {
                if(numbers.get(i) < numbers.get(num)){
                    rightSum += numbers.get(i);
                }
            }
            if(leftSum >= rightSum){
                System.out.printf("Left - %d", leftSum);
            } else {
                System.out.printf("Right - %d", rightSum);

            }
        } else if (type.equals("expensive")) {
            for (int i = 0; i < num; i++) {
                if(numbers.get(i) >= numbers.get(num)){
                    leftSum += numbers.get(i);
                }
            }
            for (int i = num; i <numbers.size() -1 ; i++) {
                if(numbers.get(i) >= numbers.get(num)){
                    rightSum += numbers.get(i);
                }
            }
            if(leftSum >= rightSum){
                System.out.printf("Left - %d", leftSum);
            } else {
                System.out.printf("Right - %d", rightSum);

            }
        }
    }
}
