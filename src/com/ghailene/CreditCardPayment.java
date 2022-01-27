package com.ghailene;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("paiement Credit Card effectué avec succes");
    }
}
