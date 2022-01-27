package com.ghailene;

public class PaymentContext {

    private PayStrategy strategy;

    public PaymentContext(PayStrategy strategy) {
        this.strategy = strategy;
    }


    void executePayment() {
        if (strategy == null) {
            System.err.println("Aucun de paiement n'a ete defini");
            return;
        }
        strategy.pay();
    }

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }
}
