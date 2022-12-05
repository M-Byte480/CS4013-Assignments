public class SavingsAccount extends BankAccount{

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount){
        if(amount <= this.getBalance()){
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "Savings account" + "\n" + super.toString();
    }
}
