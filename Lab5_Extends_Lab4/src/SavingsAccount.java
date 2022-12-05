public class SavingsAccount extends BankAccount{

    public SavingsAccount(String name, int id, double balance) {
        super(name, id, balance);
    }

    public SavingsAccount(int id, double balance){
        this(null, id, balance);
    }

    public SavingsAccount(int id){
        this(null, id, 0);
    }

    public SavingsAccount(String name, int id){
        this(name, id, 0);
    }

    @Override
    public void withdraw(double amount){
        this.withdraw(amount, null);
    }

    public void withdraw(double amount, String description){
        if(amount <= this.getBalance()){
            super.withdraw(amount, description);
        }
    }


    @Override
    public String toString() {
        return "Savings account:\n" + super.toString();
    }
}
