package entities;

public class Bank {
    private final int AccountNumber;
    private String Holder;
    private double Balance;

    public Bank(int AccountNumber, String Holder) {
        this.AccountNumber = AccountNumber;
        this.Holder = Holder;
    }

    public double getBalance() {
        return Balance;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    public String getHolder() {
        return Holder;
    }
    public void setHolder(String Holder) {
        this.Holder = Holder;
    }

    public void DepositAmount(double amount) {
        Balance += amount;
    }
    public void WithdrawAmount(double amount) {
        Balance -= amount + 5.0;
    }

    public String toString() {
        return "Account: " + getAccountNumber()
                + ", Holder: " + getHolder()
                + "Balance: $ " + getBalance();
    }
}
