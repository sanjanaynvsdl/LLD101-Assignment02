package beverages_decorator;

public class chocolateDecorator extends Beverage {

    Beverage beverage;

    public chocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        int totalCost = this.beverage.cost();
        return totalCost + 30;
    }
}
