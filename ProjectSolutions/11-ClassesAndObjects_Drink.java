package defaultpackage;

import defaultpackage.Drink;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

		ArrayList<Drink> drinksList= new ArrayList<Drink>();
		
		drinksList.add(new Drink("Blueberry", "Small", true, 1.20));
		drinksList.add(new Drink("Plain", "Small", false, 1.10));
		drinksList.add(new Drink("Cherry", "Large", true, 2.00));
		
		drinksList.get(0).printSummary();
		drinksList.get(1).printSummary();
		drinksList.get(2).printSummary();
	}

}