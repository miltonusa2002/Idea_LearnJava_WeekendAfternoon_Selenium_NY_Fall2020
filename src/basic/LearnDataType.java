package basic;

public class LearnDataType {
	
	//Data: is like information. Could be numeric, image, voice, text
	// Data type:
		//Primitive data type
			int age = 25;
			byte ram = 20;
			short number = 500;
			long ssn = 98579233943188l;
			
	
			
			double salary = 6500.50;
			float courseFee = 5000.65f;
			char pizzaSize = 'L';
			boolean isAvailable = true;
			
	public static String mobileBrand ="iphone";		
		//Non-primitive data type 	
			
			String name = "James";
			
		// Array: can take multiple data type at a time but data type has to be same	
			
			
			public static void main (String [] args) {
				
				int number1 = 25;
				int number2 = 56;
				int total = number1 + number2;
				System.out.println(total);
				
				String firstName = "James";
				String lastName = "William";
				String fullName = firstName +" "+ lastName;
				System.out.println(fullName);
				
				System.out.println(LearnAccessModifier.salary); // Protected: we declare in on LearnAccessModifier class and calling it from LearnDataType  
				
				
			}
			
			
			
			
			

}
