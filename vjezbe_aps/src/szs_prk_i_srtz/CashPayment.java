package szs_prk_i_srtz;

public class CashPayment extends PaymentMethod {

    public CashPayment(String paymentMethodName, double balance) {
        super(paymentMethodName, balance);
    }

    @Override
    public boolean performPayment(double amount) {
        if (amount > balance) {
            System.out.println("Not enough cash to perform the payment.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Payment of " + String.format("%.2f", amount) + " EUR performed successfully." +
                    " Remaining balance: " + String.format("%.2f", balance) + " EUR");
            return true;
        }
    }
}
