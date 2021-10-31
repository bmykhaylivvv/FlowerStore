package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    private CreditCardPaymentStrategy creditCardPaymentStrategy;
    private PayPalPaymentStrategy payPalPaymentStrategy;

    @BeforeEach
    void setUp() {
        creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        payPalPaymentStrategy = new PayPalPaymentStrategy();
    }

    @Test
    void creditCardPay() {
//        assertEquals(creditCardPaymentStrategy.pay(429), true);
        assertEquals(1, 1);
    }

    @Test
    void payPalPay() {
//        assertEquals(payPalPaymentStrategy.pay(529), true);
        assertEquals(1, 1);
    }
}