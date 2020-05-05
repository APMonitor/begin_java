package defaultpackage

import edu.jtclab.*;

public class Main {

	public static void main(String[] args) {
		//Connect to the Arduino
		JTCLab myLab = new JTCLab();
		
		//Turn on the LED
		myLab.LED();
		
		//Wait one second
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		
		//End the program and disconnect the Arduino
		myLab.close();
		
	}
}