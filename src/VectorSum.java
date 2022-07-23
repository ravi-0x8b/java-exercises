import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N number: ");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter the %d° number: ", i+1);
            numbers[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
            sum += numbers[i];
        }
        double avg = sum / numbers.length;

        System.out.printf("%nSUM: %.2f%n", sum);
        System.out.printf("AVERAGE: %.2f%n", avg);

        scanner.close();
    }
}
