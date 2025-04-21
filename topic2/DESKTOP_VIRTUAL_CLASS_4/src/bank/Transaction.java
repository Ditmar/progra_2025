package bank;

import java.time.LocalDate;

public class Transaction {
    private Double amount;
    private String date;
    private Boolean type;

    public Transaction(Double amount, Boolean type) {
        this.amount = amount;
        this.date = LocalDate.now().toString();
        this.type = type;
    }

    public void print() {
        System.out.println(date + " - " + (type ? "Deposit" : "Withdrawal") + ": " + amount);
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

}
