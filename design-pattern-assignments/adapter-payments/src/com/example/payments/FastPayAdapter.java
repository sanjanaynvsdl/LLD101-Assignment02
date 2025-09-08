package com.example.payments;
import java.util.Objects;

public class FastPayAdapter implements PaymentGateway {

    private final FastPayClient fastPayClient;

    public FastPayAdapter(FastPayClient fastPay) {
        Objects.requireNonNull(fastPay, "Required a object");
        this.fastPayClient = fastPay;
    }

    @Override
    public String charge(String customerId, int amountCents) {
        Objects.requireNonNull(customerId,"Invalid id");
        return fastPayClient.payNow(customerId, amountCents);
    }

}
