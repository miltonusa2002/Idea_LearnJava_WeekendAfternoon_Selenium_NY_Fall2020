package basic;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {

		// Scanner is a class
		// How to create an object of scanner class?
		// className objectName = new constractorOfClass();
		Scanner input = new Scanner(System.in); // In means input.
		System.out.println("Enter your first name");
		String firstName = input.nextLine(); //Creating a variable but user will enter the variable value
		System.out.println("First Name: " + firstName);

		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		System.out.println("Last Name: " + lastName);

		System.out.println("Full name: " + firstName + " " + lastName);

		System.out.println("Enter course fee");
		double cFee = input.nextDouble();
		System.out.println("Course fee is " + cFee);

		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println("Age is: " + age);

		// Since we created input scanner object. We have to close it for better practice
		input.close();

	}

}
