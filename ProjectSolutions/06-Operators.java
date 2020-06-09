import edu.jtclab.*;

public class Main {

	public static void main(String[] args) {

		JTCLab myLab = new JTCLab();

		double temp1 = myLab.T1();
		double temp2 = myLab.T2();

		System.out.println("Temperature 1: " + temp1);
		System.out.println("Temperature 2: " + temp2);

		System.out.println("Are the temperatures equal?");
		System.out.println(temp1==temp2);

		System.out.println("The difference is:");
		System.out.println(temp1-temp2);

	}

}
