public class SavingsAccount extends Account {

    private double minimumBalance = 100;
    private double interestRate = 0.05;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= minimumBalance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal rejected. Minimum balance required.");
        }
    }

    @Override
    public void endOfMonth() {

        double interest = balance * interestRate;
        balance = balance + interest;

        System.out.println("Interest added: " + interest);
    }
}