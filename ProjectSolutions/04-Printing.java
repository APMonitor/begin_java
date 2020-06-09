import edu.jtclab.*;

public class Main {

	public static void main(String[] args) {

		//Create our JTCLab object.
		//You can name it whatever you want. I named mine "myLab"
		JTCLab myLab = new JTCLab();

		//set two variables to the read values from the thermometers
		double temp1 = myLab.T1();
		double temp2 = myLab.T2();

		//print out the values of the two variables.
		//Notice how after the colon, I include a space.
		//If I didn't do this, the program would output 'Temperature 1:24.02'
		System.out.println("Temperature 1: " + temp1);
		System.out.println("Temperature 2: " + temp2);

	}

}
