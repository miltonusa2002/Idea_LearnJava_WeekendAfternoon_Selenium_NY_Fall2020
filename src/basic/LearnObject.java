package basic;

public class LearnObject {
	
	//How to create object
		//className objectName = new constructorOfClass(); --syntax of creating object
	
	int num1= 34;
	int num2 = 45;
	
	public static void main(String[] args) {
		
		LearnObject learn = new LearnObject();
		int total = learn.num1 + learn.num2; //call by object name
		System.out.println("Total value is " + total);
		
	//Can we create multiple of same class?
		// Yes, have to use different object name
		LearnObject obj = new LearnObject();
		
		obj.num1 = 66;
		obj.num2 = 77;
		int output = obj.num1+obj.num2;
		System.out.println("Output is "+output);
		
	//Can we create another object from different class here?
		//Yes
		
		LearnDataType dataType = new LearnDataType(); //created object in LearnDataType class
		
		LearnStatic ls = new LearnStatic(); ////created object in LearnStatic class
		
		LearnStatic.tvDisplay();
	
		
		
	}
	
	
	
	
	
	
	

}
