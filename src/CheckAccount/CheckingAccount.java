package CheckAccount;

public class CheckingAccount{

    //balance 余额；number 卡号
    private double balance;
    private int number;
    public CheckingAccount(int number) {
        this.number = number;
    }
    //method : 存钱
    public void deposit(double amount) {
        balance += amount;
    }
    //method : 取钱
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount < balance) {
            balance -= amount;
        }else {
            double needs = amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }
    //返回余额
    public double getBalance() {
        return balance;
    }
    //返回卡号
    public int getNumber() {
        return number;
    }
}
