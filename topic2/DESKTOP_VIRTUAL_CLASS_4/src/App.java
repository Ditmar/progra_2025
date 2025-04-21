import bank.LimitAccount;
import bank.RegisterTransaction;

public class App {
    public static void main(String[] args) throws Exception {
        RegisterTransaction register = new RegisterTransaction();
        LimitAccount limitAccount = new LimitAccount(5000.00, register);
        limitAccount.add(400.00);
        limitAccount.showBalance();
        limitAccount.debit(600.00);
        limitAccount.showBalance();
        limitAccount.add(7000.00);
        limitAccount.showBalance();
        limitAccount.debit(6000.00);
        limitAccount.showTransactions();

    }
}
