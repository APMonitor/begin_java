package defaultpackage;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner string_scanner = new Scanner(System.in);
		Scanner number_scanner = new Scanner(System.in);
		
		String operationType;
		float num1;
		float num2;
		
		System.out.println("What operation would you like to do? Type one of the following (+, -, *, /)");
		operationType = string_scanner.nextLine();

		System.out.println("What is your first number?");
		num1 = number_scanner.nextFloat();

		System.out.println("What is your second number?");
		num2 = number_scanner.nextFloat();


		System.out.println("The answer is:");
		
		if (operationType.equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (operationType.equals("-")) {
			System.out.println(num1 - num2);
		}
		else if (operationType.equals("*")) {
			System.out.println(num1 * num2);
		}
		else if (operationType.equals("/")) {
			System.out.println(num1 / num2);
		}
	}
}
