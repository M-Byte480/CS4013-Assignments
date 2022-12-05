import java.util.ArrayList;

public class TestBankAccount {
    public static void main(String[] args) {
        ArrayList<BankAccount> bankOfIreland = new ArrayList<>();

        SavingsAccount savings = new SavingsAccount(1825015134, 100.0);
        CurrentAccount current = new CurrentAccount(2221415, 25, 50);

        bankOfIreland.add(savings);
        bankOfIreland.add(current);
        bankOfIreland.add(new CurrentAccount(12121212, 250.0));
        bankOfIreland.add(new SavingsAccount(12121344, 200.0));

        BankAccount.setAnnualInterestRate(0.08);

        System.out.println("The savings account balance:");
        System.out.println("Initial Balance: " + savings.getBalance());
        savings.deposit(25);
        System.out.println("Deposited 25: " + savings.getBalance());
        savings.withdraw(126);
        System.out.println("Can not overdraft 126: " + savings.getBalance());
        System.out.println();

        System.out.println("The current account balance:");
        System.out.println("Initial Balance: " + current.getBalance());
        current.deposit(12.5);
        System.out.println("Deposited 12.5: " + current.getBalance());
        current.withdraw(70);
        System.out.println("Withdrawn 70: " + current.getBalance());
        current.withdraw(18.5);
        System.out.println("Can not withdraw 18.5: " + current.getBalance());
        current.withdraw(17.5);
        System.out.println("Withdrawn 17.5: " + current.getBalance());

        System.out.println("The interest rate for current account: " + current.getMonthlyInterestRate() +"\n" +
        "The interested rate for savings account: " + savings.getMonthlyInterestRate());
        System.out.println();

        for (BankAccount bankAccount :
                bankOfIreland) {
            System.out.println("Bank account Number " + bankOfIreland.indexOf(bankAccount) + "\n");
            System.out.println(bankAccount.toString());
            System.out.println();
        }

    }
}
