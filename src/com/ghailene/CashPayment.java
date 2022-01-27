package com.ghailene;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("paiement cash paiement effectué avec succes");
    }
}
