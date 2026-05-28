package szs_prk_i_srtz;

public class TestApp {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
                new CashPayment("Cash", 100.00),
                new CreditCardPayment("CreditCard1", 150.00),
                new CashPayment("Cash", 300.00),
                new CreditCardPayment("CreditCard2", 400.00)
        };

        double amount = 155.00;

        for (PaymentMethod payment : payments) {
            System.out.println(payment);
            if (payment.performPayment(amount)) {
                System.out.println("Payment successful!");
                System.out.println("----------------------------------------------");
            } else {
                System.out.println("Payment failed.");
                System.out.println("Amount attempted: " + String.format("%.2f", amount) + " EUR");
                System.out.println("----------------------------------------------");
            }
        }
    }
}
