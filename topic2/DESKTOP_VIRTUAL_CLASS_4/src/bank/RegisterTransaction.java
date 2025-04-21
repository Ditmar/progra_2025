package bank;

import java.util.ArrayList;

public class RegisterTransaction {
    private ArrayList<Transaction> register;

    public RegisterTransaction() {
        this.register = new ArrayList<Transaction>();
    }

    public void addTransaction(Double amount, Boolean type) {
        this.register.add(new Transaction(amount, type));
    }

    public void showAll() {
        for (Transaction transaction : this.register) {
            transaction.print();
        }
    }
}
