package com.example.orders;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;
import PricingRules.isValidEmail;
import PricingRules.isValidDiscount;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;

    public Order(OrderBuilder orderB) {
        this.id = orderB.id;
        this.customerEmail = orderB.customerEmail;
        this.lines = new ArrayList<OrderLine>(orderB.lines);
        this.discountPercent = orderB.discountPercent;
        this.expedited = orderB.expedited;
        this.notes = orderB.notes;
    }

    public String getId() {
        return id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public List<OrderLine> getLines() {
        // return lines;
        // leaks internal list
        // -> return deep copy instead of the ref,
        List<OrderLine> newList = new ArrayList<>();
        for (OrderLine line : lines) {
            newList.add(new OrderLine(line));
        }
        return newList;
    }

    

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public boolean isExpedited() {
        return expedited;
    }

    public String getNotes() {
        return notes;
    }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines)
            sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null)
            return base;
        return base - (base * discountPercent / 100);
    }

    // ----------Helper class
    static class OrderBuilder {
        private String id;
        private String customerEmail;
        private final List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent; // 0..100 expected, but not enforced
        private boolean expedited;
        private String notes;

        public OrderBuilder(String id, String email) {
            this.id = id;
            this.customerEmail = email;
        }

        public OrderBuilder setDiscountPercent(Integer discountPercent) {
            if(!isValidDiscount(discountPercent)) {
                throw new RuntimeErrorException(null, "Invalid discount!");
            }
            this.discountPercent = discountPercent;
            return this;
        }

        public OrderBuilder setExpedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public OrderBuilder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public OrderBuilder addLine(OrderLine line) {
            this.lines.add(line);
            return this;
        }

        public Order build() {
            if (!isValidEmail(this.customerEmail)) {
                throw new RuntimeErrorException(null, "Invlaid email");
            }

            List<OrderLine> newList = new ArrayList<>();

            for (OrderLine o : this.lines) {
                newList.add(new OrderLine(o));
            }
            this.lines = newList;
            return new Order(this);
        }

}
