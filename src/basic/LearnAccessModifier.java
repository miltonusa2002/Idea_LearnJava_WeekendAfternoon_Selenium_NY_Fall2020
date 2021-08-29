package basic;

public class LearnAccessModifier {
	
	// Access modifier/ access specifier: We can use it on class, variable, method
	// Type: 
		// Private: Only we can call or use within the class where it is located. 
		// Public: we can call or use within class where it is located and from any other class within the same project from any other package and class
		// Protected: Only accessible from all the class of that particular package
		// Default
	
	
	private static int age = 24;
	
	protected static int salary = 4000;
	
	static String staudentName = "James William"; // Default is always public
	
	public static void main(String args[]) {
		
		System.out.println(LearnDataType.mobileBrand);
		System.out.println(LearnAccessModifier.age);
		
		int num1 = 20;
		
		System.out.println(num1);
	}

}
