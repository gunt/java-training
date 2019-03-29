package whitebook;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
		
		int num;
		int num2;
		String operation;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("First Number: ");
		num = input.nextInt();
		
		
		System.out.println("Second Number: ");
		num2 = input.nextInt();
		
		
		Scanner op = new Scanner(System.in);
		
		
		System.out.println("Operation: ");
		operation = op.next();
		
		// 1st. Block of if
		if(operation.equals("+"))
			
		{
			
			System.out.println("Answer: " + (num + num2));
			
			
		}
		
		// 2nd. Block of if
		if(operation.equals("-"))
			
		{
			
			System.out.println("Answer: " + (num - num2));
			
			
		}
		
		
		// 3rd. Block of if
		if(operation.equals("/"))
			
		{
			
			System.out.println("Answer: " + (num / num2));
			
			
		}
		
		// 4th. Block of if
		if(operation.equals("*"))
			
		{
			
			System.out.println("Answer: " + (num * num2));
			
			
		}
		
		
	}
	

}
