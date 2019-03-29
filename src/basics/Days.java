package basics;

public class Days {
	public static void main(String[] args) {
		// Execute different block of code based on the value of the condition
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
			case "Monday" : 
				System.out.println("Today is Monday");
			case "Tuesday" : 
				System.out.println("Today is Tuesday");
				// Break is needed when you want to stop the code
				//break;
			case "Wednesday" :
				System.out.println("Today is Wednesday");
			case "Thursday" : 
				System.out.println("Today is Thursday");
			case "Friday" : 
				System.out.println("Today is Friday");
		}
		
	}

}

