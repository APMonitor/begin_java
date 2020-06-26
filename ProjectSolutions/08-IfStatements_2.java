package defaultpackage;

import edu.jtclab.*;
import  java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		JTCLab myLab = new JTCLab();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please type in a power level");
		double pwLevel = s.nextDouble();
		
		System.out.println("Heating up...");
		myLab.Q1(pwLevel);
		myLab.Q2(pwLevel);
		
		while (true) {
			if (myLab.T1() > 35 && myLab.T2() > 35) {
				System.out.println("Both heaters have passed 35 degrees Celcius");
				break;
			}
			else if (myLab.T1() > 30 && myLab.T2() > 30) {
				myLab.LED();
			}
			
		}
		
		myLab.close();
	}

}