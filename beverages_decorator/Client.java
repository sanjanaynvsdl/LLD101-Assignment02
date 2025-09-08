package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
				// coffee = new Latte(coffee);
        // System.out.println("Base : "+coffee.cost());
		System.out.println(coffee.cost());

		coffee = new Latte(coffee);
		System.out.println("Added Latte : "+coffee.cost());

		coffee = new chocolateDecorator(coffee);
		System.out.println("Added Chocolate : "+coffee.cost());

		
		

	}

}