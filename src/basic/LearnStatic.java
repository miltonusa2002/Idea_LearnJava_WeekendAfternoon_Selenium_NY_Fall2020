package basic;

public class LearnStatic {
	
	// Declare variable: Declare date type with variable name 
	int age;
	
	//Declare variable and assign value
	int pizzaPrice =25;
			
  String stMotherName= "Jennifer";
  
	public static String stName ="Isha"; //Static global variable
	String stAddress ="New York";  // non-static global variable  
	
	//Static method
	public static void tvDisplay() {
		
		System.out.println("TV display is UHD");
	}
	
	
	//non-static method
	public void display() {
		System.out.println("Display is good");
		
	}
	
	
	public static void main(String[] args) {
		
		//Semicolon we use to complete a statement 
		
		//How to call static variable inside main method
			//Static variable call by class name as that variable in class level. In class level mean inside of class
		
		
		LearnStatic.stName = "Kevin"; // Reassign value
		System.out.println(LearnStatic.stName);
		
	
		
		//How to call non- static variable/method inside main method
			//We need to create a object, then call by odject name 
			//How to create an object?
			//className objectName = new constructorOfClass(); --syntax of creating object
			 LearnStatic obj = new LearnStatic(); //New is keyword for creating an object, constructorOfClass is same as class name
			 System.out.println(obj.stAddress);
			 
			 obj.age = 34; // you can assign value in object level
			 System.out.println(obj.age);
			 
			 obj.pizzaPrice =45;
			 System.out.println("Pizza Price "+obj.pizzaPrice);
			 
			 System.out.println(obj.stMotherName);
			 
			 obj.display(); //call by object name
		
		String stPhoneNumner = "7186079365"; //Local variable 
		LearnStatic.tvDisplay();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
