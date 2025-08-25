package src;

public class OverNightShipping extends Shipment {
    public OverNightShipping(double weightKg) {
        super(weightKg);
    }

    @Override
    public double calculateCost() {

        System.out.println("Calculating the overnight shipping ");
        double total = 120 + 10 * weightKg;
        
        System.out.println("Total is : " + total);
        return total;
    }

}
