package com.example.payments;

import java.util.HashMap;
import java.util.Map;

import com.example.payments.StripeClient;

public class App {
    public static void main(String[] args) {
        Map<String, PaymentGateway> gateways = new HashMap<>();
        // TODO: register adapters instead of raw SDKs -done
        gateways.put("fastpay", new FastPayAdapter(new FastPayClient()));
        gateways.put("safecash", new SafeCashAdapter(new SafeCashClient()));
        gateways.put("stripe", new StripePaymentAdapter(new StripeClient()));


        OrderService svc = new OrderService(gateways);

        String id1 = svc.charge("fastpay", "cust-1", 1299);
        String id2 = svc.charge("safecash", "cust-2", 1299);
        String id3 = svc.charge("stripe","customer-3", 23211);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
    }
}
