public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int id, double balance, double overdraftLimit){
        this(null, id, balance, overdraftLimit);
    }

    public CurrentAccount(int id, double balance){
        this(id, balance, 0);
    }

    public CurrentAccount(String name, int id, double balance){
        this(name, id, balance, 0);
    }

    public CurrentAccount(String name, int id, double balance, double overdraftLimit) {
        super(name, id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount, String description){
        if(amount <= (this.getBalance() + overdraftLimit)){
            super.withdraw(amount, description);
        }
    }

    public void withdraw(double amount){
        this.withdraw(amount, null);
    }


    @Override
    public String toString() {
        return "Current Account: \n" + super.toString() +
                "overdraft limit: " + overdraftLimit + " \n";
    }
}
