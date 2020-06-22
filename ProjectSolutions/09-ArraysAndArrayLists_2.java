import edu.jtclab.*;
import  java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		JTCLab myLab = new JTCLab();

		//power the heaters to 50%
		myLab.Q1(50);
		myLab.Q2(50);

		ArrayList<Double> temps1 = new ArrayList<Double>();
		ArrayList<Double> temps2 = new ArrayList<Double>();
		
		//add temperatures to ArrayList
		for (int j = 0; j <= 12; j ++) {
			temps1.add(myLab.T1());
			temps2.add(myLab.T2());

			try {Thread.sleep(5000);} catch (InterruptedException e) {}
		}
		
		myLab.close();
		
		System.out.println(temps1);
		System.out.println(temps2);


	}

}