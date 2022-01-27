package com.ghailene;

public class Main {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext(new PaypalPayment());
        paymentContext.executePayment();

        paymentContext.setStrategy(new CashPayment());
        paymentContext.executePayment();

        paymentContext.setStrategy(null);
        paymentContext.executePayment();

        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.executePayment();

    }
}
