import java.util.Locale;
import java.util.Scanner;

public class MaxPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d/%d%n", i+1, n);
            System.out.printf("%d° value: ", i+1);
            values[i] = scanner.nextInt();
        }
        int max = values[0], position = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
                position = i;
            }
        }
        System.out.printf("Max value: %d%n", max);
        System.out.printf("Position: %d%n", position+1);
        scanner.close();
    }
}
