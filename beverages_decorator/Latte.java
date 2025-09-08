package beverages_decorator;

public class Latte extends Beverage {

	// @Override
	// public int cost() {
	// 	return 20;
	// }

	Beverage beverage;

	public Latte(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public int cost() {
		int totalCost = this.beverage.cost();
		return totalCost+20;
	}

}