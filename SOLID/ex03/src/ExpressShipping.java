package src;

public class ExpressShipping extends Shipment {

    public ExpressShipping(double weightKg) {
        super(weightKg);
    }

    @Override
    public double calculateCost() {
        
        System.out.println("Calculating the express shipping");
        double total = 80+8*weightKg;

        System.out.println("Total is : "+total);
        return total;
    }

}
