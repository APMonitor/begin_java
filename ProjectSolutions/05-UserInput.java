import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//I comment these project solutions excesively to make it extra clear what I am doing.
		//In real life, it is considered bad practice to overcomment your code.
		//Rather, you shoud name your variables and write your code clearly enough
		//That any person who reads it after you can understand what's goin on without
		//lot's of extra explanation

		//create your scanner object
		Scanner myScanner = new Scanner(System.in);

		//print the first prompt
		System.out.println("Input your first number:")

		//store the user's response in a variable
		float a = myScanner.nextFloat();

		//print the second prompt
		System.out.println("Input your second number:")

		//store the user's response in another variable
		float b = myScanner.nextFloat();

		//print the answer
		System.out.println("Your answer is:")
		System.out.println(a+b)

	}

}
