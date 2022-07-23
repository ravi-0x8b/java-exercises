import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the N numbers: ");
        int n = scanner.nextInt();
        if (n <= 10) {
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Enter the %d° number: ", i + 1);
               numbers[i] = scanner.nextInt();
            }
            System.out.println("NEGATIVE NUMBERS: ");
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    System.out.println(numbers[i]);
                }
            }
        }
        scanner.close();
    }
}
