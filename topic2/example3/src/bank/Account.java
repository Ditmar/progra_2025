package bank;

public class Account {
    private Double balance;
    
    public Account(Double balance) {
        this.balance = balance;
    }
    public void add(Double money) {
        this.balance += money;
    }
    public void debit(Double money) {
        if (this.balance >= money) {
            this.balance -= money;
        }
    }
    public void showBalance() {
        System.out.println("The balance is " + this.balance);
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    

    
    
}
