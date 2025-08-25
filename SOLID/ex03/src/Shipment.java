package src;

public abstract class Shipment {
    double weightKg;

    Shipment(double w) {
        this.weightKg = w;
    }

    public abstract double calculateCost();
}