public class CurrentAccount extends Account {

    private double overdraftLimit = 500;
    private double monthlyFee = 20;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount >= -overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal rejected. Overdraft limit exceeded.");
        }
    }

    @Override
    public void endOfMonth() {

        balance = balance - monthlyFee;

        System.out.println("Monthly fee deducted: " + monthlyFee);
    }
}