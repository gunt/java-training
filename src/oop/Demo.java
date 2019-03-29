package oop;


// That 
class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
		
	}
	
	void eat() {
		System.out.println(email);
		
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
		
		
	}
	

	
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Gunther";
		person1.email = "gunt@testemail.com";
		person1.phone = "984805409704";
		
		// Abstraction
		person1.walk();
		
		
		///
		/*person1.sleep();
		person1.eat();
		*/
		
		Person person2 = new Person();
		person2.name = "Ella";
		person2.sleep();
		
		
		
		
		/*// Person- 
		
		// Attributes, variables, adjectives, discriptors
		String name = "Gunther";
		String email = "gunt@testemail.com";
		String phone = "984805409704";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		
		// what if we wanted to do this for another person?
		// Attributes, variables, adjectives, discriptors
		String name2 = "Ella";
		String email2 = "ella@testemail.com";
		String phone2 = "7493743979437";
		
		// Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2+ " is eating");
		
		// What about binding attributes and properties together? see the top from line 4

	}
	
		// Enhance by adding functions to minimize code
		static void walking(String name) {
			System.out.println(name + " is walking");
		*/	
		}
	

}










