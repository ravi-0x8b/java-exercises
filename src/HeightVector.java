import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class HeightVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N person: ");
        int n = scanner.nextInt();

        Person[] person = new Person[n];

        int count = 0;
        for (int i = 0; i < person.length; i++) {
            System.out.printf("[%d°] person:%n", i+1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            count += (age < 16) ? 1 : 0;
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            person[i] = new Person(name, age, height);
            System.out.println();
        }
        double personAverage = ((double) count / n) * 100.0;
        double sum = 0.0, heightAverage = 0.0;


        for (int i = 0; i < person.length; i++) {
            sum += person[i].getHeight();
        }
        heightAverage = sum / n;
        System.out.println("Height average: " + heightAverage);
        System.out.println("Persons under the age of 16: " + heightAverage + "%");
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() < 16) {
                System.out.println(person[i].getName());
            }
        }
        scanner.close();
    }
}
