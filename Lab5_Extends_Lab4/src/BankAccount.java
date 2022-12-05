import java.time.LocalDate;
import java.util.ArrayList;

public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private LocalDate dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    /**
     * Creates a bank account object
     * @param id
     * @param balance
     */
    public BankAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDate.now();
        this.transactions.add(new Transaction("D", this.balance, this.balance, "Initial Balance"));
    }

    public BankAccount(String name, int id, double balance){
        this(id, balance);
        this.name = name;
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

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }

    /**
     * Withdraw and add it into the transaction arrayList
     * @param amount
     * @param description
     */
    public void withdraw(double amount, String description){
        this.balance -= amount;
        transactions.add(new Transaction("W", amount, this.balance, description));
    }

    /**
     * Deposit and add it to the transaction arrayList
     * @param amount
     * @param description
     */
    public void deposit(double amount, String description){
        this.balance += amount;
        transactions.add(new Transaction("D", amount, this.balance, description));
    }

    public void withdraw(double amount){
        this.withdraw(amount, null);
    }

    public void deposit(double amount){
        this.deposit(amount, null);
    }

    @Override
    public String toString() {
        return  ((name != null)? "Name: " + name + "\n" : "" ) +
                "ID: " + id + " \n" +
                "Created: " + dateCreated + " \n" +
                "Balance: " + balance + " \n" +
                "Yearly Interest: " + annualInterestRate + "\n";
    }

    public String accountDetails(){
        StringBuilder details = new StringBuilder(this.toString()).append("\nTRANSACTIONS:\n");
        int num = 0;
        if(transactions.size() != 0) {
            for (Transaction transaction :
                    transactions) {
                details.append("Transaction ").append(num).append(transaction.toString());
                num++;

            }
        }else{
            details.append("\tThere is no transaction made\n");
        }
        return details.append("=".repeat(20)).toString();
    }
}
