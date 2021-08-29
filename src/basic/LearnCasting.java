package basic;

public class LearnCasting {
	
	//Casting means converting data type
	// Primitive data type to primitive data type
	//non-primitive to non primitive 
	
	public static void main(String[] args) {
		//Example of primitive to primitive 
		double price = 35.99;
		int discountedPrice = (int)price;
		System.out.println(discountedPrice);
		
		int num1 = 60;
		int num2 = 40;
		int num3 = num1;
		int num4 = num3 + num2;
		System.out.println("Total is " + num4);
		
		int age = 24;
		double newAge = (double) age;
		System.out.println(newAge);
		
		int number=56;
		byte total=(byte) number;
		System.out.println("Int to byte "+total);
		
		//Example of non-primitive to non-primitive 
		String name = "Arafat";
		String stName = name;
		
		//Transferring String to int
		String ssn = "1234";
		int newSsn = Integer.parseInt(ssn); //Integer is class name here since we know Integer start with upper case
		System.out.println(newSsn);
		int newSsn1=Integer.valueOf(ssn);
		System.out.println(newSsn1);
		
		int salary=25;
		String s=String.valueOf(salary);
		System.out.println(s);
		
		
		
	}

}
