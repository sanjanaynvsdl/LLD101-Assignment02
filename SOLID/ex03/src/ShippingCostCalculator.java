package src;

public class ShippingCostCalculator {

    Shipment shipObj;

    public ShippingCostCalculator(Shipment ship) {
        this.shipObj = ship;
    }

    double cost() {
        // if ("STANDARD".equals(s.type)) return 50 + 5*s.weightKg;
        // if ("EXPRESS".equals(s.type)) return 80 + 8*s.weightKg;
        // if ("OVERNIGHT".equals(s.type))return 120 + 10*s.weightKg;
        // throw new IllegalArgumentException("Unknown type: " + s.type);

        double total = shipObj.calculateCost();
        return total;
    }
}
