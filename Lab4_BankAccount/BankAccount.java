import java.time.*;

public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private LocalDate dataCreated;

    public BankAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dataCreated = LocalDate.now();
    }

    public void setId(int id){
        this.id = id;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        BankAccount.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getDataCreated() {
        return dataCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return  "id: " + id + " \n" +
                "created: " +dataCreated + " \n" +
                "balance: " +balance + " \n" +
                "yearly interest: " + annualInterestRate + "\n";
    }
}
