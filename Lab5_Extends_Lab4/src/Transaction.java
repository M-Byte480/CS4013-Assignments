import java.time.LocalDate;

public class Transaction {
    private LocalDate date = LocalDate.now();
    private String type, description;
    private double balance, amount;

    /**
     * Constructs a transaction object
     * @param type
     * @param amount
     * @param balance
     * @param description
     */
    public Transaction(String type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {

        return String.format(
                "\n\t{\n\tdate = " + date +
                ", \n\ttype = '" + type + '\'' +
                ", \n\tamount = " + amount +
                ", \n\tbalance = " + balance +
                        ((description != null ? ", \n\tdescription = '" + description + '\'' : "")) + "\n\t}\n"
        );
    }
}
