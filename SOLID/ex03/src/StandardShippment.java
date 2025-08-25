package src;

public class StandardShippment extends Shipment {

    public StandardShippment(double weightKg) {
        super(weightKg);
    }

    @Override
    public double calculateCost() {
        System.out.println("Calculating the standard shipping ");
        double total = 50 + 5 * weightKg;
        System.out.println("Total is : " + total);
        return total;
    }
}
