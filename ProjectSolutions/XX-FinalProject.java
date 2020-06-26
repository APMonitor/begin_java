package defaultPackage;

import edu.jtclab.*;
import java.util.ArrayList;

public class Main {
	
	static double HEATER_INITIAL = 100;
	static double HEATER_LOW = 0;
	static double TARGET_TEMPERATURE = 37;
	static double WAIT_TIME = 1;
	static double DURATION = 10;
	
	public static void main(String[] args) {
		
		JTCLab myLab = new JTCLab();
		
		ArrayList<Double> temperatures = new ArrayList<Double>();
		ArrayList<Double> heaterLevels = new ArrayList<Double>();
		
		double heaterLevel = HEATER_LOW;
		
		int iterations = (int) ((DURATION*60)/WAIT_TIME);
		
		System.out.println("Heating to target temperature...");
		
		for(int i = 0; i < iterations; i++) {
			double temp = myLab.T1();
			
			heaterLevels.add(heaterLevel);
			temperatures.add(temp);
			
			if (temp < TARGET_TEMPERATURE) {
				heaterLevel = HEATER_INITIAL;
			}
			else {
				heaterLevel = HEATER_LOW;
			}
			
			myLab.Q1(heaterLevel);
			myLab.LED(heaterLevel);
			
			try{Thread.sleep((long) (WAIT_TIME*1000));} catch(InterruptedException  e){}
		}
		
		myLab.close();
		
		System.out.println(temperatures);
		System.out.println(heaterLevels);
		
	}

}
