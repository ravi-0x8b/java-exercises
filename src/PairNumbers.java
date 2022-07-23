import java.util.Locale;
import java.util.Scanner;

public class PairNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° number: ", i+1);
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Pair numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ", ");
            }
        }
        scanner.close();
    }
}
