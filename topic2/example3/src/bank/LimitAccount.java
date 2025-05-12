package bank;

public class LimitAccount extends Account {
    private Double limit;
    public LimitAccount(Double balance) {
        super(balance);
        updateLimit();
    }

    public void updateLimit() {
        this.limit = this.getBalance() / 2;
    }
    @Override
    public void add(Double money) {
        super.add(money);
        updateLimit();
    }
    @Override
    public void debit(Double money) {
        if (money <= this.limit) {
            super.debit(money);
            updateLimit();
        }
        
    }
}
