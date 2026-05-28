package szs_prk_i_srtz;

public class CreditCardPayment extends PaymentMethod {

    private static final double COMPENSATION_PERCENTAGE = 0.02;

    public CreditCardPayment(String paymentMethodName, double balance) {
        super(paymentMethodName, balance);
    }

    @Override
    public boolean performPayment(double amount) {
        double totalCost = amount * (1 + COMPENSATION_PERCENTAGE);

        if (totalCost > balance) {
            System.out.println("Not enough credit to perform the payment.");
            return false;
        } else {
            balance -= totalCost;
            System.out.println("Payment of " + String.format("%.2f", amount) + " EUR performed successfully - " +
                    "with compensation of: " + String.format("%.2f", amount * COMPENSATION_PERCENTAGE) + " EUR. " +
                    "Remaining credit: " + String.format("%.2f", balance) + " EUR");
            return true;
        }
    }
}
