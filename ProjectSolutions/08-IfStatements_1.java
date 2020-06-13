import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sString = new Scanner(System.in);
		String operationType;
		float num1;
		float num2;
		
		while (true) {

			System.out.println("What opperation would you like to do? Type one of the following (+, -, *, /)");
			operationType = s.nextLine();

			System.out.println("What is your first number?");
			num1 = float.toString(s.nextLine());

			System.out.println("What is your second number?");
			num2 = float.toString(s.nextLine());


			System.out.println("The answer is:")
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

}