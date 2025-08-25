package src;

public class Demo03 {
    public static void main(String[] args) {
        // System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS",
        // 2.0)));

        Shipment ship = new ExpressShipping(2.0);
        Shipment overNytShip = new OverNightShipping(3.0);

        ShippingCostCalculator shipCostCal = new ShippingCostCalculator(overNytShip);
        shipCostCal.cost();

    }
}
