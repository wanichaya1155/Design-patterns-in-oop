
public class App {
	public static void main(String[] args) {
		//Beverage plainBeverage = new PlainBeverage();
		//Beverage plainBeverage  = new Sugar(new PlainBeverage());
		// Beverage plainBeverage  = new Milk(new PlainBeverage());
		Beverage plainBeverage  = (new Milk(new Sugar(new Sugar(new PlainBeverage()))));

		System.out.println("You order " + plainBeverage.getDescription());
		System.out.println("The cost is " + plainBeverage.getCost());
		
	}
}
