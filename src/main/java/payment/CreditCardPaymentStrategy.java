package payment;

public class CreditCardPaymentStrategy {
    public boolean pay(double price) {
        System.out.printf("Paid %f with PayPal\n", price);
        return true;
    }
}
