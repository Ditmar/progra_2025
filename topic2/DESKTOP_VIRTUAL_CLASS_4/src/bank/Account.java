package bank;

public class Account {
    private Double balance;
    private RegisterTransaction register;

    public Account(Double initialBalance) {
        this.balance = initialBalance;

    }

    public Account(Double initialBalance, RegisterTransaction register) {
        this.balance = initialBalance;
        this.register = register;

    }

    public void add(Double amount) {
        if (amount > 0) {
            balance += amount;
            this.register.addTransaction(amount, true);
        } else {
            System.out.println("Amount must be positive");
        }
    }

    public void debit(Double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            this.register.addTransaction(amount, false);
        } else {
            System.out.println("Invalid amount for subtraction");
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("My balance is :  " + this.balance);
    }

    public void showTransactions() {
        this.register.showAll();
    }
}
