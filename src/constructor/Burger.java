package constructor;

public class Burger {

	// We can create multiple constructor of one class
	// Also we can create multiple objects of one class

	String nameOfBurger;
	char size;
	String topping;
	double priceOfBurger;
	int quantityOfBurger;
	double tottalValue;
	boolean isBurgerAvailable;

	// Default constructor must be created before creating parametarized constructor

	// Default constructor
	public Burger() {

	}

	// Parametarized constructor
	public Burger(String nameOfBurger) {
		this.nameOfBurger =nameOfBurger;
		System.out.println("Burger name is "+this.nameOfBurger); //This way passing the value to gloabal variable
		//System.out.println("Burger name is " + nameOfBurger); // This way not passing the value to gloabal variable

	}
	
	
	public Burger (String nameOfBuger, char size) {
		
		String burgerName = this.nameOfBurger = nameOfBuger;
		char burgerSize = this.size = size;
		
		System.out.println("Burger name is "+ burgerName + " Burger size +"+ burgerSize);
	}
	

	public Burger (String nameOfBuger, String topping, char size) {
		String bugerName = this.nameOfBurger = nameOfBuger;
		String toppingName = this.topping = topping;
		char burgerSize = this.size = size;
		
		System.out.println("Burger name is "+bugerName+" Burger topping is "+ topping+ " Burger size is "+ burgerSize);
		
	}
	
	public Burger (String nameOfBurger, String topping, char size, double priceOfBurger, int quantityOfBurger, double tottalValue, boolean isBurgerAvailable) {
		String burgerName = this.nameOfBurger = nameOfBurger;
		String toppingName = this.topping = topping;
		char burgerSize = this.size = size;
		double burgerPrice = this.priceOfBurger = priceOfBurger;
		int burgerQuantity = this.quantityOfBurger = quantityOfBurger;
		double total = this.tottalValue = tottalValue;
		boolean availiabilityOfBurger = this.isBurgerAvailable = isBurgerAvailable;
		
		System.out.println("Burger Name is "+burgerName+" Burger topping is "+toppingName+" Burger Size is "+burgerSize+" Burger Price is "+burgerPrice+ " Quantity of Burger is "+ burgerQuantity+ " Total value of Burger is "+tottalValue+ " Avalibality of buger is "+availiabilityOfBurger);
		
	}
	
	
	public static void main(String[] args) {

		Burger myBurger = new Burger(); // I can create object with default constructor, without creating one

		//Eventhough my variable is same, based on the position it will give two different values
		Burger yourBurger = new Burger("Dominos");
		System.out.println(yourBurger.nameOfBurger);
		
		Burger herBurger = new Burger("Five guys");
		System.out.println(herBurger.nameOfBurger);
		
		Burger theirBurger = new Burger("Dominos","Mushroom", 'S');

		Burger ourBuger = new Burger("Pizza Hut", "Onion", 'L', 5.50, 2, 11.0, true);
		

	}

}
