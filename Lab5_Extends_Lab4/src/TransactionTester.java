import java.util.ArrayList;

public class TransactionTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankOfIreland = new ArrayList<>();

        SavingsAccount milan = new SavingsAccount("Milan's Account" , 1825015134, 100.0); // 0
        CurrentAccount brendan = new CurrentAccount("Brendan's account", 2221415, 25, 50);

        BankAccount.setAnnualInterestRate(0.08);

        milan.deposit(25); // 1

        milan.withdraw(126); // 2 Doesn't occur
        milan.deposit(12.5); // 2 Actually occur
        milan.withdraw(70); // 3

        milan.withdraw(18.5); // 4
        milan.withdraw(17.5); // 5

        bankOfIreland.add(milan);
        bankOfIreland.add(brendan);

        for (BankAccount account :
                bankOfIreland) {
            System.out.println(account.accountDetails());
        }
    }
}
