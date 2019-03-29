package whitebook;

public class Conditional {
	
	public static void main(String[] args) {
		
		int testscore = 100;
		char grade;
		
		String excellent;
		excellent = " Super!! Tu calificacion es Excelente";
		
		if (testscore >= 100) {
			
			grade = 'A';
		}
		
		else if (testscore >= 90) {
			
			grade = 'B';
			
		}
		else if (testscore >= 80) {
			
			grade = 'C';
			
		}
		else if (testscore >= 70) {
			
			grade = 'D';
			
		}
		else  {
			
			grade = 'F';
			
		}
		
		System.out.println("Grade: " + grade + excellent);
		
	}
	
	
	
}
