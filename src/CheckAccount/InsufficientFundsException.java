package CheckAccount;
/**
 * 自定义异常类，继承Exception
 * @author dev6923626ic
 *
 */
@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {

    private double amount;
    public InsufficientFundsException(double amount) {
        this.amount = amount;

    }
    public double getAmount() {
        return amount;
    }
}

