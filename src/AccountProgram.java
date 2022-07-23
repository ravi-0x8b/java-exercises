import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class AccountProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accNumber = scanner.nextInt();
        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char response = scanner.nextLine().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = scanner.nextDouble();
            account = new Account(accNumber, holder, amount);
        }
        else {
            account = new Account(accNumber, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(account.toString());
        System.out.print("Enter a deposit value: ");
        double deposit = scanner.nextDouble();
        account.DepositAmount(deposit);

        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        account.WithdrawAmount(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(account.toString());

        scanner.close();
    }
}
