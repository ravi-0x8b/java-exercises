import java.util.Locale;
import java.util.Scanner;
import entities.Bank;

public class BankProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNumber = scanner.nextInt();
        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char confirm = scanner.nextLine().charAt(0);
        Bank bank = new Bank(accNumber, holder);
        if (confirm == 'Y' || confirm == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = scanner.nextDouble();
            bank.DepositAmount(amount);
        }
        System.out.print("Account data: ");
        System.out.println(bank.toString());
        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        bank.DepositAmount(deposit);

        System.out.println("Updated account data: ");
        System.out.println(bank.toString());

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        bank.WithdrawAmount(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(bank.toString());

        scanner.close();
    }
}
