package basic;

import basic.LearnNestedClass.Computer;

public class LearnNestedClass {
	
	//Nested class/child class
	//Below created class in another class
	//We can not create a static variable inside of child class, unless we declare child class as static
	// We will create main method only in one class
	
	int num = 20;
	int num1 = 30;
	
	public static void main(String[] args) {
		
		LearnNestedClass learn = new LearnNestedClass();
		System.out.println(learn.num1);
		
		Computer com = new Computer();
		System.out.println(com.computerName);
		System.out.println(Computer.computerPrice);
		Computer.computerDisplay();
		
		
		
	}
	
	public static class Computer{
		
		String computerName = "HP";
		static String computerPrice = "2000";
		
		public static void computerDisplay() {
			
			System.out.println("Computer Display");
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
	}
	
	
		

}
