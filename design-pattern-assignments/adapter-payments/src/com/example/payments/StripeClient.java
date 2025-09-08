package com.example.payments;

public class StripeClient {

    public String makePayment(String custId, int amountCents) {
        return "Stripe Payment #" + custId + ":" + amountCents;
    }
}
