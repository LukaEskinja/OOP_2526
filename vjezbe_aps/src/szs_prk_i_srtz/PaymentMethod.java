package szs_prk_i_srtz;

public abstract class PaymentMethod {
    protected String paymentMethodName;
    protected double balance;

    protected PaymentMethod(String paymentMethodName, double balance) {
        this.paymentMethodName = paymentMethodName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean performPayment(double amount);

    @Override
    public String toString() {
        return paymentMethodName + " [ balance: " + String.format("%.2f", balance) + " EUR ]";
    }
}
