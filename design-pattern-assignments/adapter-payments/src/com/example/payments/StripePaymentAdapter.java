package com.example.payments;

import java.util.Objects;

public class StripePaymentAdapter implements PaymentGateway{
    private final StripeClient stripeClient;

    public StripePaymentAdapter(StripeClient  stripeClient) {
        Objects.requireNonNull(stripeClient,"Require a payament client");
        this.stripeClient=stripeClient;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        Objects.requireNonNull(customerId,"Invalid id");
        return stripeClient.makePayment(customerId, amountCents);
    }
    
}
