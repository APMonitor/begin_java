import edu.jtclab.*;
import  java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//this section of the program takes in the user's input
		Scanner s = new Scanner(System.in);
		float selection = -1;

		while (selection < 1 || selection > 100) {
			System.out.println("Please type a power level between 1 and 100");
			selection = s.nextInt();
		}

		//this section of the program heats up the heaters and then prints out the temperatures in a loop
		JTCLab myLab = new JTCLab();

		//power the heaters to the power level input by the user
		myLab.Q1(selection);
		myLab.Q2(selection);

		//print the temperatures out in a loop
		for (int j = 0; j < 12; j ++) {
			System.out.println("Temperatures after " + Integer.toString(j*5) + " seconds");

			System.out.println("Temperature 1: " + myLab.T1());
			System.out.println("Temperature 2: " + myLab.T2());

			try {Thread.sleep(5000);} catch (InterruptedException e) {}
		}

		myLab.close()


	}

}