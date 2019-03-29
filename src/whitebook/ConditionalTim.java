package whitebook;

public class ConditionalTim {
	
	public static void main(String[] args) {
		
		int temperature = 45;
		//String sunCondition = "Sunny";
		String sunCondition = "Overcast";
				
		if(temperature >=80) {
			
			System.out.println("It's pleasant. Wear shorts and T-shirts");
		}
		
		else if((temperature > 60) && (sunCondition == "Sunny")) {
			
			System.out.println("It's a little cooler. Perhaps wear jeans.");
			System.out.println("Wear a hat!");
			
		}

		else if((temperature > 50) || (sunCondition == "Overcast")) {
			
			System.out.println("It's a little cooler. Perhaps wear jeans.");
			
		}
		
		else {
			
			System.out.println("Look like a cold day!");
			
		}
		
			System.out.println("The program is finish");
	}
	
	
	
}
		
	

