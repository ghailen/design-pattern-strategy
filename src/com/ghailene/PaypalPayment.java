package com.ghailene;

public class PaypalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("paiement Paypal effectué avec succes");
    }
}
