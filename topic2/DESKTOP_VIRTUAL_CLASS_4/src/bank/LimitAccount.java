package bank;

public class LimitAccount extends Account {
    private Double limit;

    public LimitAccount(Double initialBalance) {
        super(initialBalance);
        updateLimit();
    }

    public LimitAccount(Double initialBalance, RegisterTransaction register) {
        super(initialBalance, register);
        updateLimit();
    }

    public void updateLimit() {
        this.limit = this.getBalance() / 2;
    }

    @Override
    public void debit(Double amount) {
        if (amount < this.limit) {
            super.debit(amount);
            updateLimit();
        }
    }

    @Override
    public void add(Double amount) {
        super.add(amount);
        updateLimit();
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

}
