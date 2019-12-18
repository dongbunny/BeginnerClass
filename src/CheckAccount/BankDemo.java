package CheckAccount;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(101);
        ca.deposit(500.00);
        try {
            ca.withdraw(100.00);
            ca.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }

    }
}
