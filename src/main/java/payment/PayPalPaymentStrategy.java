package payment;

public class PayPalPaymentStrategy implements Payment {
    public boolean pay(double price) {
        System.out.printf("Paid %f with PayPal\n", price);
        return true;
    }
}
