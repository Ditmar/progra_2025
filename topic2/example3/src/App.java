import bank.*;

public class App {
    public static void main(String[] args) throws Exception {
        LimitAccount account = new LimitAccount(1000.00);
        account.add(5000.00);
        account.showBalance();
        account.debit(1000.00);
        account.showBalance();
        account.debit(2000.00);
        account.showBalance();
        account.debit(2000.00);
        account.showBalance();
    }
}
