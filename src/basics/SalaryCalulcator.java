package basics;

public class SalaryCalulcator {
	public static void main (String[] args) {
		// Let's create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//Declare & Define
		int hoursPerWeek = 40 ;
		int weeksPerWeek = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		
		double salary = hoursPerWeek * weeksPerWeek * rate ;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + "per hour is $" + salary + " per year.");
		
		
		
		
		// Computer our annual salary
		
		// rate * hoursPerWeek * weeksPerYear
		
		
	}

}
