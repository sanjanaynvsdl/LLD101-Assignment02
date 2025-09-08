package com.example.payments;

import java.util.Objects;


public class SafeCashAdapter implements PaymentGateway{

    private final SafeCashClient safeCash;

    public SafeCashAdapter(SafeCashClient sfClient) {
       Objects.requireNonNull(sfClient, "Required a obj!");
        this.safeCash = sfClient;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        Objects.requireNonNull(customerId,"Invalid id");
        //createPayment(amount, user) -> method signature, 
         SafeCashPayment sfPayment = safeCash.createPayment( amountCents,customerId);
         return sfPayment.confirm();
    }
    
}
