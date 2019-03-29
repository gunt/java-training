package whitebook;

import java.util.Scanner;

public class Input{
	
	public static void main(String[] args) {
		
		System.out.println("What's your name?");
		Scanner test = new Scanner(System.in);
		System.out.println("Hello !" + test.nextLine());
		
		
	}
}