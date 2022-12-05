public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int id, double balance, double overdraftLimit){
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(int id, double balance){
        this(id, balance, 0);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= (this.getBalance() + overdraftLimit)){
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "Current Account: \n" + super.toString() +
                "overdraft limit: " + overdraftLimit + " \n";
    }
}
