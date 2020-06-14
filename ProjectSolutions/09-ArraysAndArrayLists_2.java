import edu.jtclab.*;
import  java.util.Scanner;
import java.util.ArrayList;

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

		ArrayList<Double> temps1 = new ArrayList<Double>();
		ArrayList<Double> temps2 = new ArrayList<Double>();
		
		//add temperatures to ArrayList
		for (int j = 0; j <= 12; j ++) {
			temps1.add(myLab.T1());
			temps2.add(myLab.T2());

			try {Thread.sleep(5000);} catch (InterruptedException e) {}
		}
		
		myLab.close();
		
		//calculate averages
		double temp1_total = 0;
		double temp2_total = 0;
		
		for (int i = 0; i <= 12; i++) {
			temp1_total += temps1.get(i);
			temp2_total += temps2.get(i);
		}
		
		double temp1_average = temp1_total/12;
		double temp2_average = temp2_total/12;
		
		//print out which heater had the greater average or whether they were equal
		if (temp1_total == temp2_total) {
			System.out.println("The two average temperatures were equal");
		}
		else if (temp1_total > temp2_total) {
			System.out.println("The average temperature of heater 1 was greater");
		}
		else {
			System.out.println("The average temperature of heater 2 was greater");
		}


	}

}