package defaultpackage

import edu.jtclab.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program to Hatch an Egg");
		
		int target_temperature = 37;
		int current_temperature = 30;
		int difference = target_temperature - current_temperature

		String temperature_units = " degrees Celcius";

		System.out.println(Integer.toString(difference) + temperature_units) 
		//hint: use 'Integer.toString(difference)'
		//to convert the integer 'difference' to a String so you can print it together with 'temperature_units'
		
	}
}