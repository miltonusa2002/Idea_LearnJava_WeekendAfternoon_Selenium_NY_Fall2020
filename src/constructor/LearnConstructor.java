package constructor;

public class LearnConstructor {
	
	//What is constructor?
	//Constructor name should be same name as class name 
	//Constructor has no return type
	//Constructor are used to initialize object
	
	//AccessModifier className () {}   //Way to create constructor and it can not be created within main method
	
	//Example of creating constructor. it is default constructor.
	//Default constructor is without parameter
	
	String stName;
	String stAddress;
	int stAge;
	double courseFee;
	String stPhoneNumber;
	
	
	public LearnConstructor() {
		
		//System.out.println("This is default constructor");
		int num1 = 50;
		int num2 = 50;
		int total = num1+num2;
		
		//System.out.println("The Total is:" + total);
		
	}
	
	//Signature pattern. To create multiple constructor of a class 
	//Create Parameter
	//Single Parametarized constructor 
	public LearnConstructor (String name) {
		System.out.println("Student name is " + name);
		
	}
	
	//Multiple  Parametarized constructor 
	public LearnConstructor (String name, int age) {
		System.out.println("Student name is "+ name+" age is "+age);
		
		
	}
	
	
	String pizzaName = "Dominos";
	
	//This keyword is used to call global varibales inside the constructor
	public LearnConstructor(String name, String address) {
		this.stName =name;
		this.stAddress = address;
		System.out.println("Student name is "+this.stName+" Student address is "+this.stAddress);
		
	}
	
	
	public LearnConstructor (String stAddress, String stName, String stPhoneNumber, int stAge, double courseFee) {
		
		this.stAddress =stAddress;
		this.stName = stName;
		this.stPhoneNumber =stPhoneNumber;
		this.stAge = stAge;
		this.courseFee =courseFee;
		
	
		System.out.println("Student name "+this.stName+" address "+this.stAddress+" Phone Number "+this.stPhoneNumber+" age " +this.stAge+" Course Fee is "+this.courseFee);
	}
	
	public static void main (String [] args) {
		
	//ClassName objectName = new ConstructorOfClass();
		// Since default constritor has some code after running it we can see output in the console, since main method has default constructor
		LearnConstructor learn = new LearnConstructor();
		
		LearnConstructor student = new LearnConstructor("Abu Mohammed"); //Argument passing. CTRL + SPACE. Providing value by calling  
		LearnConstructor nasir = new LearnConstructor("Nasir Khan");
		
		LearnConstructor mamun = new LearnConstructor("Mamun Khan", 34);
		
		LearnConstructor farha = new LearnConstructor("Farha Chowdhury", "Bronx, NY");
		
		LearnConstructor ghania = new LearnConstructor("Queens,NY", "Ghania Chowdhury", "7186079365", 34, 5000.500);
		
		
		
		
		
	}

}
