import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", 500));
        accounts.add(new CurrentAccount("C001", 200));

        for (Account account : accounts) {

            System.out.println("\nAccount: " + account.accountNumber);

            System.out.println("Starting balance: " + account.getBalance());

            account.withdraw(600);

            System.out.println("After withdrawal: " + account.getBalance());

            account.endOfMonth();

            System.out.println("End of month balance: " + account.getBalance());
        }
    }
}