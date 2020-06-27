package defaultpackage;

public class Drink {
	
	public String flavor;
	public String size;
	public boolean ice;
	public double price;
	
	public Drink(String flavor, String size, boolean ice, double price) {
		
		this.flavor = flavor;
		this.size = size;
		this.ice = ice;
		this.price = price;
	}
	
	public void printSummary() {
		System.out.println("Flavor: " + flavor);
		System.out.println("Size: " + size);
		System.out.println("Ice?: " + Boolean.toString(ice));
		System.out.println("Price: $" + Double.toString(price));
	}
}