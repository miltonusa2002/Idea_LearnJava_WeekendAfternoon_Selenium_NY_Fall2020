package problemsandsolutions;

import java.util.Scanner;

public class TakesTwoNumbersAsInputAndDisplayTheProductOfTwoNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input first number");
		int num1 = input.nextInt();

		System.out.println("Input second number");
		int num2 = input.nextInt();

		int product = num1 * num2;

		System.out.println("The product is: " + product);
		
		// to close scanner
		input.close();

	}

}
