import edu.jtclab.*;
import  java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		JTCLab labbo = new JTCLab();

		Scanner scanny = new Scanner(System.in());
		double pwlevel = scanny.nextFloat();

		labbo.Q1(pwLevel)
		labbo.Q1(pwLevel)

		while (!(labbo.T1() > 35 || labbo.T2() > 35)) {
			if ((labbo.T1() > 35 && labbo.T2() > 35)) {
				labbo.LED();
			}
		}
		System.out.println("Both heaters have passed 35 degrees Celcius");
		labbo.close();
	}

}