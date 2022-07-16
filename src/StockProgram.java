import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class StockProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.println("Name: ");
        product.name = sc.next();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        sc.close();
    }
}
