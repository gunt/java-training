package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
		
		
	}
	// Functions with no parameters, no return type
	static void printName() {
		System.out.println("My name is Gunther");
	}
	
	 // Functions with parameters with a return type 
	static void addNumbers(int numberA, int numberB) {
		// This function will add two numbers
		
		int sum = numberA + numberB;
		System.out.println("The sum of numbers: " + numberA + " and " + numberB + " is " + sum);
	}
	// Functions that has a retusn type with the parameter
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
		
	}
	
 
}
